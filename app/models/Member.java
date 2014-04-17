package models;

import play.db.ebean.*;
import play.data.validation.Constraints.*;
import play.data.*;

import javax.persistence.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Entity
public class Member extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Email
    @OneToMany(cascade=CascadeType.ALL, mappedBy="email")
    public String email;

	@Required
	public String password;

	@Required
	public String firstName;

	@Required
	public String lastName;

   public Member(String email, String password, String firstName, String lastName)
    {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

	public static Finder<Integer, Member> find = new Finder(Integer.class, Member.class);

    public static void create(Member user) {
    	
		user.save();
	}

	public void delete(Member user) {
		user.delete();
	}
    public static List<Member> all(){
        return find.all();
    }


	public static Member authenticate(String email, String password) {
		return find
				.where()
				.eq("email", email)
				.eq("password", password)
				.findUnique();
	}
	
	public static Member get(String email) {
		return find
				.where()
				.eq("email", email)				
				.findUnique();
	}

  public static Map<String, String> names()
    {
        HashMap<String, String> users = new HashMap();
        for(Member i : all()) {
           users.put(i.email, i.firstName + " " + i.lastName);
        }
        return users;
    }
}