package controllers;

import models.Shop;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class ShopController extends Controller {
    static Form<Shop> shopForm = Form.form(Shop.class);

    public static Result display(int id)
    {
        return ok(views.html.shop.display.render(Shop.find(id)));
    }

    public static Result blank()
    {
       /* if (session().get("email")==null)
            return redirect(routes.UserController.login());

        else  */
            return ok(views.html.shop.create.render(shopForm, User.names()));
    }

    public static Result submit()
    {
        Form<Shop> filledForm = shopForm.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(views.html.shop.create.render(filledForm, User.names()));
        }
        else {
            Shop shop = filledForm.get();
            Shop.create(shop);

            return redirect(routes.ProductController.blank());

        }
    }
}
