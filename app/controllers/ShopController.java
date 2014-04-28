package controllers;

import java.util.List;

import models.Shop;
import models.Product;
import models.Member;
import play.data.Form;
import play.data.validation.ValidationError;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

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
	public static Result profile(Long id){
        String loggedInUserEmail = session("email");
      List<Shop> shops_on_email= Shop.findbyemail(loggedInUserEmail);
        String shopname = session("shop_name");
       List<Product> product_on_email= Shop.findProductByOwner(id);

        return ok(views.html.shop.profile.render(shops_on_email,product_on_email ));
    }
	public static Result profileFound(Long id){
        String loggedInUserEmail = session("email");
        List<Shop> shops_on_id= Shop.findById(id);
        String shopname = session("shop_name");
        List<Product> product_on_id= Shop.findproduct(id);

        return ok(views.html.shop.found.render(shops_on_id,product_on_id,id ));
    }
	
	public static Result delete(Long id) {
		Shop shop=Shop.findbyid(id);
		Shop.delete(shop);
		 return ok(index.render());
	}
	
	public static Result edit(Long id) {
        Form<Shop> shopForm = Form.form(Shop.class).fill(
               Shop.findbyid(id)
        );
        String loggedInUserEmail = session("email");
        return ok(
                views.html.shop.edit.render(id, shopForm,loggedInUserEmail)
        );
    }

    public static Result update(Long id) {
        Form<Shop> shopForm = Form.form(Shop.class).bindFromRequest();
        Member user=Member.findbyemail(session("email"));
        shopForm.get().owner.id=user.id;
        String loggedInUserEmail = session("email");
        if(shopForm.hasErrors()) {
            return badRequest( views.html.shop.edit.render(id, shopForm,loggedInUserEmail));
        }
        shopForm.get().update(id);
        session("category",shopForm.get().category);
        session("shop_name",shopForm.get().name);

        List<Shop> shops_on_id= Shop.findByOwnerId(id);
        String shopname = session("shop_name");
        List<Product> product_on_id= Shop.findproduct(id);
        return redirect(routes.ShopController.profile(user.id));
       // return redirect(views.html.shop.profile.render(shops_on_id,product_on_id,id ));
    }

	
	
	public static Result submit() {
		Form<Shop> filledForm = shopForm.bindFromRequest();
		String loggedInUserEmail = session("email");
		if (filledForm.hasErrors()) {
			
			for(String key : filledForm.errors().keySet()){
			      List<ValidationError> currentError = filledForm.errors().get(key);
			      for(ValidationError error : currentError){
			          flash(key, error.message());
			      }
			  }      
			
			
			return badRequest(views.html.shop.create.render(filledForm,
					loggedInUserEmail));
		} else {
			Shop shop = filledForm.get();
			Member user=Member.findbyemail(loggedInUserEmail);
	            shop.owner.id=user.id;
		savedShop=Shop.create(shop);
		
		 
          session("category",shop.category);
         session("shop_name",shop.name);
//Product_Shop product_shop;
//product_shop.shop_id=shop.id;
	//ProductController.add_shop_id(savedShop.id);
return redirect(routes.ProductController.addProduct());

		}
	}
}
