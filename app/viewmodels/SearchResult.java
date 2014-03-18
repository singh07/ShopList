package viewmodels;

import models.Shop;
import play.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Akash Singh
 * Date: 11/7/13
 * Time: 1:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class SearchResult extends Controller {

    public String criteria;
    public String keyword;

    public List<Shop> shops;

    public SearchResult()
    {
        shops = new ArrayList();
    }
}
