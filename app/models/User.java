package models;

import play.db.ebean.*;
import play.data.validation.Constraints.*;
import play.data.*;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Entity
public class User extends Model {

	@Id
    @Email
	public String email;

	@Required
	public String password;

	@Required
	public String firstName;

	@Required
	public String lastName;

    public User(String email, String password, String firstName, String lastName)
    {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

	public static Finder<Integer, User> find = new Finder(Integer.class, User.class);

    public static void create(User user) {
		user.save();
	}

	public void delete(User user) {
		user.delete();
	}

    public static List<User> all(){
        return find.all();
    }


	public static User authenticate(String email, String password) {
		return find
				.where()
				.eq("email", email)
				.eq("password", password)
				.findUnique();
	}

    public static Map<String, String> names()
    {
        HashMap<String, String> users = new HashMap();
        for(User i : all()) {
           users.put(i.email, i.firstName + " " + i.lastName);
        }
        return users;
    }
}