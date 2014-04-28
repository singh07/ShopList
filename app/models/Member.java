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
	@SequenceGenerator(name = "member_gen", sequenceName = "member_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_gen")
	@Column(name = "id")
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "owner_id")
	public Long id;

	@Email
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "owner_email")
	public String email;

	@Required
	public String password;

	@Required
	public String firstName;

	@Required
	public String lastName;

	@Lob
	@Column(name = "user_pic")
	public byte[] user_pic;

	public Member(String email, String password, String firstName,
			String lastName, byte[] user_pic) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.user_pic = user_pic;
	}

	public static Finder<Integer, Member> find = new Finder<Integer, Member>(
			Integer.class, Member.class);

	public static void create(Member user) {

		user.save();
	}

	public void delete(Member user) {
		user.delete();
	}

	public static List<Member> all() {
		return find.all();
	}

	public static Member findbyemail(String email) {

		Member user = Member.find.where().eq("email", email).findUnique();

		return user;
	}

	public static Member findById(Long id) {

		Member user = Member.find.where().eq("id", id).findUnique();

		return user;
	}

	public static Member authenticate(String email, String password) {
		return find.where().eq("email", email).eq("password", password)
				.findUnique();
	}

	public static Member get(String email) {
		return find.where().eq("email", email).findUnique();
	}

	public static Map<String, String> names() {
		HashMap<String, String> users = new HashMap();
		for (Member i : all()) {
			users.put(i.email, i.firstName + " " + i.lastName);
		}
		return users;
	}
}