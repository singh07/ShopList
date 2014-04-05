
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
object add extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Product],Form[Product],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(products: List[Product], addProductForm: Form[Product]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Html("Add Product"))/*6.27*/ {_display_(Seq[Any](format.raw/*6.29*/("""
 """),format.raw/*25.13*/("""

<fieldset>
    <legend>Add Product</legend>
  <div class="jumbotron">
      """),format.raw/*36.4*/("""
      <form class="form-inline" action=""""),_display_(Seq[Any](/*37.42*/routes/*37.48*/.ProductController.save())),format.raw/*37.73*/("""" method="post">
      <input type="text" class="form-inline input-lg" placeholder="Enter product name" name="name">
      <input type="text" class="form-inline input-lg" placeholder="Enter product price" name="price">




      <input type="submit" value="Add" class="btn btn-lg btn-primary">
          </form>
  </div>
 </fieldset>
"""),format.raw/*48.6*/("""

""")))})))}
    }
    
    def render(products:List[Product],addProductForm:Form[Product]): play.api.templates.HtmlFormat.Appendable = apply(products,addProductForm)
    
    def f:((List[Product],Form[Product]) => play.api.templates.HtmlFormat.Appendable) = (products,addProductForm) => apply(products,addProductForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 01 22:26:25 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/product/add.scala.html
                    HASH: 639f120c01cd39da6d402c53fcd819444ca57800
                    MATRIX: 801->1|1001->57|1029->110|1065->112|1098->137|1137->139|1167->530|1272->894|1350->936|1365->942|1412->967|1773->1306
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|36->25|41->36|42->37|42->37|42->37|53->48
                    -- GENERATED --
                */
            