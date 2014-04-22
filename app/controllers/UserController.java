package controllers;

import models.Member;
import models.Shop;
import java.util.List;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import viewmodels.*;
import static play.data.Form.*;

public class UserController extends Controller{

	static Form<Member> userForm = Form.form(Member.class);
   // static Form<Login> loginForm = Form.form(Login.class);

    public static Result blank()
    {
        return ok(views.html.user.create.render(userForm));
    }

    public static Result submit()
    {
        Form<Member> filledForm = userForm.bindFromRequest();

        if(filledForm.hasErrors()) {
            return ok(views.html.user.create.render(userForm));
        }
        else {
            Member.create(filledForm.get());
            return redirect(routes.ApplicationController.index());
        }
    }




	public void update(int id)
	{}
	
	public void delete(int id)
	{}
	
	public static Result login()
	{
        return ok(views.html.user.login.render(form(Login.class)));
	}
	
	public static Result logout()
	{
        session().clear();
        flash("success", "You've been logged out");
        return redirect(routes.UserController.login() );


	}
	
	  public static  Result account(){

	        Member current_user=Member.findbyemail(session("email"));
	        List<Shop> user_shops =Shop.findbyemail(session("email"));
	        return ok(views.html.user.account.render(current_user,user_shops));
	    }

    public static Result authenticate()
    {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        

        if(loginForm.hasErrors()) {
            return badRequest(views.html.user.login.render(loginForm));
        }

        else{
        	  Login  userlogin = loginForm.get();
        	
           if (Login.validate(userlogin.email,userlogin.password)){
        	   
        	  Member user=  Member.findbyemail(userlogin.email);
               session("email", userlogin.email);
               session("firstname", user.firstName);
               session("lastname", user.lastName);

               List<Shop> user_shops =Shop.findbyemail(userlogin.email);

               return ok(views.html.user.account.render(user,user_shops));
               
           }
            else{

               return redirect(routes.UserController.login());
           }
        }

    }









}
