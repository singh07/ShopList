package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import viewmodels.*;

public class UserController extends Controller{

	static Form<User> userForm = Form.form(User.class);
    static Form<Login> loginForm = Form.form(Login.class);

    public static Result blank()
    {
        return ok(views.html.user.create.render(userForm));
    }

	public static Result submit()
	{
		Form<User> filledForm = userForm.bindFromRequest();

	    if(filledForm.hasErrors()) {
		   return ok(views.html.user.create.render(userForm));
	  	}
	  	else {
            User.create(filledForm.get());
            return redirect(routes.ApplicationController.index());
	  	}
	}
	
	public void update(int id)
	{}
	
	public void delete(int id)
	{}
	
	public static Result loginform()
	{
        return ok(views.html.user.login.render(loginForm));
	}
	
	public void logout()
	{
	}
}
