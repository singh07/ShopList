package controllers;

import models.Shop;
import models.Member;
import models.Product;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class ProductController extends Controller {

    static Form<Product> productForm = Form.form(Product.class);

    public static Result blank() {

        Form<Product> productFormData = productForm.bindFromRequest();
        return ok(views.html.product.add.render(Product.all(),productFormData ));
     }


    public static Result save() {
        Form<Product> productFormData = productForm.bindFromRequest();
        if(productFormData.hasErrors()) {

            return badRequest(views.html.product.add.render(Product.all(), productFormData));

        } else {
            Product.create(productFormData.get().name,productFormData.get().price);
            return redirect(routes.ProductController.blank());
        }
    }

        public static Result delete(Long id) {
            Product.delete(id);
            return redirect(routes.ProductController.afterDeletion());

    }
    public static Result afterDeletion() {
        return ok(views.html.product.add.render(Product.all(), productForm));

    }

}
