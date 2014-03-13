package models;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.avaje.ebean.*;

import java.util.LinkedList;
import java.util.List;

@Entity
public class Shop extends Model {

	@Id
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
	
	@ManyToOne
    @Required
	public User owner;

    public static Model.Finder<Long,Shop> find = new Model.Finder(Long.class, Shop.class);

    /**
     * Retrieve a Shop from id.
     */
    public static Shop find(int id) {
        return find.where().eq("id", id).findUnique();
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
