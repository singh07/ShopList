package controllers;

import models.Shop;
import models.Member;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class ShopController extends Controller {

	static Form<Shop> shopForm = Form.form(Shop.class);

	public static Result display(int id) {	

		return ok(views.html.shop.display.render(Shop.find(id)));
	}

	public static Result blank() {
		String loggedInUserEmail = session("email");
		Shop shop = new Shop();
				
		shop.email = Member.get(loggedInUserEmail);
		shopForm.fill(shop);	
		
		return ok(views.html.shop.create.render(shopForm, loggedInUserEmail));
	}

	public static Result submit() {
		Form<Shop> filledForm = shopForm.bindFromRequest();

		if (filledForm.hasErrors()) {
			String loggedInUserEmail = session("email");
			return badRequest(views.html.shop.create.render(filledForm,
					loggedInUserEmail));
		} else {
			Shop shop = filledForm.get();
			Shop.create(shop);

			return redirect(routes.ProductController.blank());

		}
	}
}
