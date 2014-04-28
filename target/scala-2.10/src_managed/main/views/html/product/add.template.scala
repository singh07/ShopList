
package views.html.product

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object add extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[List[Product],Form[Product],String,List[models.Product],Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(products: List[Product], addProductForm: Form[Product],category:String,prod:List[models.Product],user_id:Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.113*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Html("Add Product"))/*6.27*/ {_display_(Seq[Any](format.raw/*6.29*/("""


<fieldset>
    <legend><h2>Add Product
     <a  class="btn pull-right" href=""""),_display_(Seq[Any](/*11.40*/routes/*11.46*/.ShopController.profile(user_id))),format.raw/*11.78*/("""">Go to shop</a></h2>
    </legend>
  <div class="jumbotron">
      """),format.raw/*20.4*/("""
      <form class="form-inline" action=""""),_display_(Seq[Any](/*21.42*/routes/*21.48*/.ProductController.save())),format.raw/*21.73*/("""" method="post">
      <input type="text" class="form-inline input-lg" placeholder="Enter product name" name="name">
      <input type="text" class="form-inline input-lg" placeholder="Enter product price(Rs.)" name="price">

          <input type="hidden" class="form-inline input-lg"  name="category" value=""""),_display_(Seq[Any](/*25.86*/category)),format.raw/*25.94*/("""">


      <input type="submit" value="Add" class="btn btn-lg btn-primary">
          </form>
  </div>

    <h3>"""),_display_(Seq[Any](/*32.10*/prod/*32.14*/.size())),format.raw/*32.21*/(""" product(s) added</h3>
    """),_display_(Seq[Any](/*33.6*/if(!(prod.size()==0))/*33.27*/    {_display_(Seq[Any](format.raw/*33.32*/("""
    <div class="bs-example">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>Product</th>
                <th>Price(Rs.)</th>

            </tr>
            </thead>

            """),_display_(Seq[Any](/*44.14*/for(product <- prod) yield /*44.34*/ {_display_(Seq[Any](format.raw/*44.36*/("""
            <tbody>
            <tr>
                <td>"""),_display_(Seq[Any](/*47.22*/product/*47.29*/.name)),format.raw/*47.34*/("""</td>
                <td>"""),_display_(Seq[Any](/*48.22*/product/*48.29*/.price)),format.raw/*48.35*/("""</td>
                <td><a href=""""),_display_(Seq[Any](/*49.31*/routes/*49.37*/.ProductController.delete(product.id))),format.raw/*49.74*/(""""><button type="button" class="btn btn-default">Delete</button></a></td>
            </tr>

            </tbody>
            """)))})),format.raw/*53.14*/("""
        </table>
    </div>

     """)))})),format.raw/*57.7*/("""



    """),format.raw/*78.8*/("""

</fieldset>
"""),format.raw/*81.6*/("""

""")))})))}
    }
    
    def render(products:List[Product],addProductForm:Form[Product],category:String,prod:List[models.Product],user_id:Long): play.api.templates.HtmlFormat.Appendable = apply(products,addProductForm,category,prod,user_id)
    
    def f:((List[Product],Form[Product],String,List[models.Product],Long) => play.api.templates.HtmlFormat.Appendable) = (products,addProductForm,category,prod,user_id) => apply(products,addProductForm,category,prod,user_id)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 28 22:44:30 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/product/add.scala.html
                    HASH: 97bfe2b6276b792af7d812b9f395db3b0c883320
                    MATRIX: 834->1|1090->112|1118->165|1154->167|1187->192|1226->194|1343->275|1358->281|1412->313|1507->667|1585->709|1600->715|1647->740|1993->1050|2023->1058|2172->1171|2185->1175|2214->1182|2277->1210|2307->1231|2350->1236|2618->1468|2654->1488|2694->1490|2789->1549|2805->1556|2832->1561|2895->1588|2911->1595|2939->1601|3011->1637|3026->1643|3085->1680|3243->1806|3310->1842|3345->2233|3386->2252
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|40->11|40->11|40->11|43->20|44->21|44->21|44->21|48->25|48->25|55->32|55->32|55->32|56->33|56->33|56->33|67->44|67->44|67->44|70->47|70->47|70->47|71->48|71->48|71->48|72->49|72->49|72->49|76->53|80->57|84->78|87->81
                    -- GENERATED --
                */
            