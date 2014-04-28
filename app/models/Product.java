package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.SqlQuery;
import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product extends Model {

   @Id
    @SequenceGenerator(name="product_gen", sequenceName="product_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_gen")
    @Column(name="id")
    public Long id;

    @Required
    public String name;

    @Required
    public Float price;

    @OneToOne
    @Required
    public String category;



    @ManyToOne(cascade = CascadeType.ALL)
    public Shop shop;
  //  public List<Shop> getShops(){return shops;}

  /*  public Product(String name, float price) {
        this.name = name;
        this.price = price;

    }    */
  public static List<Product> findbyemail(Long id) {
    //  Shop prod_shop= Shop.find.where().eq("owner.email", mail).findUnique();
      List<Product> prod=Product.find.where().eq("shop.id", id).findList();




      return prod;
  }


    public static List<Product> findByShopId(Long id) {
        List<Product> prod= Product.find.where().eq("shop.id", id).findList();
       // List<Product> prod=new ArrayList<>();


       // prod=prod_shop.products;

        return prod;
    }

    public static List<Product> all(){
        return find.all();
    }
   static   List<Product> products = new ArrayList<>();
//  static   User mail;
    public static Model.Finder<Long, Product> find = new Model.Finder<>(Long.class, Product.class);

    public static Product create(Product product,Shop shop) {

        product.save();

      //  products.add(product);

      //  shop.products = products;
     //   shop.save();




        return product;
    }
    public static void delete(Long id) {
        find.ref(id).delete();
    }



    public static List<Shop> findByShopName(String keyword) {
       // return Shop.find.where().ilike("name", "%" + keyword + "%").findList();
       // List<Product> prod=Product.find.where().like("name","%"+keyword+"%").findList();
       // List<Shop> found_shops=new ArrayList<>();
      // found_shops=prod.;
        List<Shop> found_shops=new ArrayList<>();
        found_shops=Shop.find.where().like("name","%"+keyword+"%").findList();
        return found_shops;

      /*  List<Product> prod=Product.find.where().like("name","%"+keyword+"%").findList();
          int count=prod.size();
        List<Shop> found_shops=new ArrayList<>();
        Shop f=new Shop();
        while (!(count==0)){

         Product prd=prod.get(count);

         found_shops=(prd.shops);
            count=count-1;

        }
        return found_shops;   */
      /*  List<Product> prd=Product.find.where().like("name","%"+keyword+"%").findList();
        int count=prd.size();
        Product prod;
        Shop fo=new Shop();
        List<Shop> found_shops=new ArrayList<>();
        while (!(count==0)){
        prod=prd.get(count--);
            fo=Shop.find.where()
         found_shops.add();

        }   */

    }

    public static Page<Product> page(int page, int pageSize, String sortBy, String order, String filter) {

        return   find.where()
                        .ilike("name", "%" + filter + "%")
                        .orderBy(sortBy + " " + order)
                        .fetch("owner")
                        .findPagingList(pageSize)
                        .setFetchAhead(false)
                        .getPage(page);
    }




}
