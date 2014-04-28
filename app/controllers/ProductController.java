package controllers;

import models.Shop;

import java.util.List;

import models.Member;
import models.Product;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class ProductController extends Controller {

   static Form<Product> productForm = Form.form(Product.class);
//  static  Product_Shop product_shop= new Product_Shop();
 // static Product savedProduct;
  
 /* public static void add_shop_id(Long id){
	  product_shop.shop_id=id;  
  }*/
   public static Result addProduct() {
       Form<Product> productFormData = productForm.bindFromRequest();
       String category=session("category");
       return ok(views.html.product.addProduct.render(productFormData,category ));
   }
  
    public static Result blank() {
    	  String category=session("category");

          Form<Product> productFormData = productForm.bindFromRequest();

          Shop shop=Shop.findshopbyemail(session("email"));
          String login_user=session("email");

        List<Product> prod=  Product.findbyemail(login_user);
    
       
        return ok(views.html.product.add.render(Product.all(),productFormData ,category,prod));
     }


    public static Result save() {
    	Form<Product> productFormData = productForm.bindFromRequest();
        String category=session("category");
        List<Product> pro=  Product.findbyemail(session("email"));
        
        if(productFormData.hasErrors()) {
        	  return ok(index.render());
          //  return badRequest(views.html.product.add.render(Product.all(), productFormData,category,pro));

        } else {
        	String mail=session("email");
        	Shop shop=Shop.findshopbyemail(mail);
            Product.create(productFormData.get(),shop);
          
            return redirect(routes.ProductController.blank());
        }
    }


    public static Result delete(Long id) {
        Product.delete(id);
        return redirect(routes.ProductController.blank());

}
    public static Result afterDeletion() {
    	  String category=session("category");
          List<Product> prod=  Product.findbyemail(session("email"));
        return ok(views.html.product.add.render(Product.all(), productForm,category,prod));

    }

}
