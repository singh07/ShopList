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
	
    
    @ManyToOne
    @JoinColumn(name="owner")
    
	public Member owner;

    public static Model.Finder<Long,Shop> find = new Model.Finder(Long.class, Shop.class);

    /**
     * Retrieve a Shop from id.
     */
    
    public static List<Shop> all(){
        
    	return find.all();
    }

   

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
    
}
