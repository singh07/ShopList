package models;

import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.ManyToMany;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import models.Shop;

@Entity
@Table(name = "product")
public class Product extends Model {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @SequenceGenerator(name="product_gen", sequenceName="product_id_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_gen")
    @Column(name="id")
    public Long id;

    @Required
    public String name;

    @Required
    public Float price;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "product_shop")
    public List<Shop> shops = new ArrayList<Shop>();

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public static List<Product> all(){
        return find.all();
    }
    public static Model.Finder<Long, Product> find = new Model.Finder<Long,Product>(Long.class, Product.class);

    public static Product create(String name,float price) {
        Product product = new Product(name, price);
        product.save();
        product.saveManyToManyAssociations("shops");
       
        return product;
    }
    public static void delete(Long id) {
        find.ref(id).delete();
    }

    public static List<Shop> findByShopName(String keyword) {
        //return Shop.find.where().ilike("name", "%" + keyword + "%").findList();
    	
    	 Product prod=Product.find.where().like("name","%"+keyword+"%").findUnique();
         List<Shop> foundshops=prod.shops;
         return foundshops;
    	
    	
    }



}
