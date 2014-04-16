package models;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;




import com.avaje.ebean.*;

import java.util.LinkedList;
import java.util.List;

@Entity
public class Product_Shop extends Model {

	@Id
	@Column(name="product_id")
	public Long product_id;

	@Id
	@Column(name="shop_id")
	public Long shop_id;

    public static Model.Finder<Long,Product_Shop> find = new Model.Finder(Long.class, Product_Shop.class);

   
    public static Product_Shop create(Product_Shop ps) {
        ps.save();
        return ps;
    }
    
    /**
     * Retrieve a Shop from id.
     */
    
    /* public static List<Product_Shop> all(){
        
    	return find.all();
    }

   

	public static Product_Shop find(int id) {
        return find.where().eq("id", id).findUnique();
    }

   
  public static List<Product_Shop> findByShopName(String keyword) {
        return Shop.find.where()
                .ilike("name", "%" + keyword + "%")
                .findList();
    }*/
    
   
    
}
