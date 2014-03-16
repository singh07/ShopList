package viewmodels;
   import models.User;
   import play.mvc.Controller;

/**
 * Created with IntelliJ IDEA.
 * User: Akash Singh
 * Date: 11/3/13
 * Time: 8:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Login extends Controller{
    public  String email;
    public  String password;
    public static boolean validate(String email,String password) {
        if (User.authenticate(email, password) == null) {
            return false;
        }
        return true;
    }
}
