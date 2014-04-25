package controllers;

import java.util.List;

import models.Shop;
import models.Product;

import models.Member;
import play.data.Form;
import play.data.validation.ValidationError;
import play.mvc.Controller;
import play.mvc.Result;

public class ShopController extends Controller {

	static Form<Shop> shopForm = Form.form(Shop.class);
	static Shop savedShop;
	public static Result display(int id) {	

		return ok(views.html.shop.display.render(Shop.find(id)));
	}
	
	public static Result displayCategory()
    {
        return ok(views.html.shop.category.render());
    }

	public static Result blank() {
		String loggedInUserEmail = session("email");
		Shop shop = new Shop();
				
		shop.owner = Member.get(loggedInUserEmail);
		
		shopForm.fill(shop);	
		
		return ok(views.html.shop.create.render(shopForm, loggedInUserEmail));
		
		
		
		
		
		
	}
	
	
	public static Result viewAll(int page, String sortBy, String order, String filter){
		
		return ok(views.html.shop.viewall.render(Shop.page(page, 4, sortBy, order, filter),
                sortBy, order, filter));	
		
	}
	public static Result profile(){
        String loggedInUserEmail = session("email");
      List<Shop> shops_on_email= Shop.findbyemail(loggedInUserEmail);
        String shopname = session("shop_name");
       List<Product> product_on_email= Shop.findproduct(loggedInUserEmail,shopname);

        return ok(views.html.shop.profile.render(shops_on_email,product_on_email ));
    }

	public static Result submit() {
		Form<Shop> filledForm = shopForm.bindFromRequest();

		if (filledForm.hasErrors()) {
			
			for(String key : filledForm.errors().keySet()){
			      List<ValidationError> currentError = filledForm.errors().get(key);
			      for(ValidationError error : currentError){
			          flash(key, error.message());
			      }
			  }      
			
			String loggedInUserEmail = session("email");
			return badRequest(views.html.shop.create.render(filledForm,
					loggedInUserEmail));
		} else {
			Shop shop = filledForm.get();
		savedShop=Shop.create(shop);
		
		 
          session("category",shop.category);
         session("shop_name",shop.name);
//Product_Shop product_shop;
//product_shop.shop_id=shop.id;
	//ProductController.add_shop_id(savedShop.id);
return redirect(routes.ProductController.blank());

		}
	}
}
