package models;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import javax.persistence.*;

import com.avaje.ebean.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Shop extends Model {

	@Id
    @SequenceGenerator(name="shop_gen", sequenceName="shop_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="shop_gen")
    @Column(name="id")
    public Long id;

	@Required
	public String name;
	
	@Required
	public String addressLine1;
	
	public String addressLine2;
	
	public String addressLine3;
	
	@Required
	public String city;

    @Required
	public String town;

    @Required
	public String phoneNumber;

    @OneToMany(mappedBy = "shops")
    public List<Product> products=new ArrayList<>();


    @Required
    @OneToOne
    public String category;

    @Lob
    @Column(name = "shop_pic")
    public  byte[] shop_pic;


    @ManyToOne
    @Required
    public Member owner;





    public static Model.Finder<Long,Shop> find = new Model.Finder<>(Long.class, Shop.class);

    /**
     * Retrieve a Shop from id.
     */
    public List<Product> getProduct(){return products;}
    public static Shop find(int id) {
        return find.where().eq("id", id).findUnique();
    }
    public static List<Shop> findById(Long id) {
        return find.where().eq("id", id).findList();
    }

    public static List<Shop> findByOwnerId(Long id) {
        return find.where().eq("owner.id", id).findList();
    }


    public static Shop findbyid(Long id) {
        return find.where().eq("id", id).findUnique();
    }

    public static List<Shop> findbyemail(String mail) {
        return find.where().eq("owner.email", mail).findList();
    }
    public static Shop findshopbyemail(String mail) {
        return find.where().eq("owner.email", mail).findUnique();
    }
    public  static List<Product> findProductByOwner(Long id){

        Shop current_shop=Shop.find.where().eq("owner.id",id).findUnique();
        List <Product> proucts_shop=current_shop.products;
        return  proucts_shop;
    }
    public  static List<Product> findproduct(Long id){

        Shop current_shop=Shop.find.where().eq("id",id).findUnique();
          List <Product> proucts_shop=current_shop.products;
        return  proucts_shop;
    }

  /*  public  statc List<Product> productOnShop(Shop shop)
    {
        List <Product>
    }   */


    public static Page<Shop> page(int page, int pageSize, String sortBy, String order, String filter) {
        return
                find.where()
                        .ilike("name", "%" + filter + "%")
                        .orderBy(sortBy + " " + order)
                        .fetch("owner")
                        .findPagingList(pageSize)
                        .setFetchAhead(false)
                        .getPage(page);
    }

    public static Shop create(Shop shop) {


        shop.save();

        return shop;
    }

    public static List<Shop> findByShopName(String keyword) {
        return Shop.find.where()
                .ilike("name", "%" + keyword + "%")
                .findList();
    }
}
