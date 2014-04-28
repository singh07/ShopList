package controllers;

import models.Shop;
import models.Member;
import models.Product;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class ProductController extends Controller {

    static Form<Product> productForm = Form.form(Product.class);

    public static Result addProduct() {
        Form<Product> productFormData = productForm.bindFromRequest();
        String category=session("category");
        Shop shop=Shop.findshopbyemail(session("email"));
        return ok(views.html.product.addProduct.render(productFormData,category,shop.owner.id));
    }

    public static Result blank() {

        String category=session("category");

        Form<Product> productFormData = productForm.bindFromRequest();

        Shop shop=Shop.findshopbyemail(session("email"));

        List<Product> prod=  Product.findbyemail(shop.id);
     // List<Product> prod=  Product.findbyemail(session("email"));

        return ok(views.html.product.add.render(Product.all(),productFormData,category,prod,shop.owner.id ));
     }


    public static Result save() {
        Form<Product> productFormData = productForm.bindFromRequest();
        Shop shop=Shop.findshopbyemail(session("email"));
        if(productFormData.hasErrors()) {
            String category=session("category");


            List<Product> prod=  Product.findbyemail(shop.id);
            return badRequest(views.html.product.add.render(Product.all(), productFormData,category,prod,shop.owner.id));

        } else {


            // Shop shop=Shop.findshopbyemail(session("email"));
            productFormData.get().shop=shop;
            Product.create(productFormData.get(),shop);
            return redirect(controllers.routes.ProductController.blank());
        }
    }

    public static Result showProducts(Long id) {

       List<Product> products=Product.findByShopId(id);
        Shop shop=Shop.findbyid(id);
        return ok(views.html.product.showProducts.render(products,shop.name,id));

    }

        public static Result delete(Long id) {
            Product.delete(id);
            return redirect(routes.ProductController.blank());

    }

  /*  public static Result afterDeletion() {
        String category=session("category");
        List<Product> prod=  Product.findbyemail(session("email"));
        return ok(views.html.product.add.render(Product.all(), productForm,category,prod));

    }  */

}
