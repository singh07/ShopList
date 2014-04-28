
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
    <legend>Add Product</legend>
  <div class="jumbotron">
      """),format.raw/*18.4*/("""
      <form class="form-inline" action=""""),_display_(Seq[Any](/*19.42*/routes/*19.48*/.ProductController.save())),format.raw/*19.73*/("""" method="post">
      <input type="text" class="form-inline input-lg" placeholder="Enter product name" name="name">
      <input type="text" class="form-inline input-lg" placeholder="Enter product price(Rs.)" name="price">

          <input type="hidden" class="form-inline input-lg"  name="category" value=""""),_display_(Seq[Any](/*23.86*/category)),format.raw/*23.94*/("""">


      <input type="submit" value="Add" class="btn btn-lg btn-primary">
          </form>
  </div>

    <h3>"""),_display_(Seq[Any](/*30.10*/prod/*30.14*/.size())),format.raw/*30.21*/(""" product(s) added</h3>
    """),_display_(Seq[Any](/*31.6*/if(!(prod.size()==0))/*31.27*/    {_display_(Seq[Any](format.raw/*31.32*/("""
    <div class="bs-example">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>Product</th>
                <th>Price(Rs.)</th>

            </tr>
            </thead>

            """),_display_(Seq[Any](/*42.14*/for(product <- prod) yield /*42.34*/ {_display_(Seq[Any](format.raw/*42.36*/("""
            <tbody>
            <tr>
                <td>"""),_display_(Seq[Any](/*45.22*/product/*45.29*/.name)),format.raw/*45.34*/("""</td>
                <td>"""),_display_(Seq[Any](/*46.22*/product/*46.29*/.price)),format.raw/*46.35*/("""</td>
                <td><a href=""""),_display_(Seq[Any](/*47.31*/routes/*47.37*/.ProductController.delete(product.id))),format.raw/*47.74*/(""""><button type="button" class="btn btn-default">Delete</button></a></td>
            </tr>

            </tbody>
            """)))})),format.raw/*51.14*/("""
        </table>
    </div>

     """)))})),format.raw/*55.7*/("""



    """),format.raw/*76.8*/("""

</fieldset>
"""),format.raw/*79.6*/("""

""")))})))}
    }
    
    def render(products:List[Product],addProductForm:Form[Product],category:String,prod:List[models.Product],user_id:Long): play.api.templates.HtmlFormat.Appendable = apply(products,addProductForm,category,prod,user_id)
    
    def f:((List[Product],Form[Product],String,List[models.Product],Long) => play.api.templates.HtmlFormat.Appendable) = (products,addProductForm,category,prod,user_id) => apply(products,addProductForm,category,prod,user_id)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 28 20:21:40 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/product/add.scala.html
                    HASH: 209c647dc5cba10eecf92574a44efcb62dbbf213
                    MATRIX: 834->1|1090->112|1118->165|1154->167|1187->192|1226->194|1332->559|1410->601|1425->607|1472->632|1818->942|1848->950|1997->1063|2010->1067|2039->1074|2102->1102|2132->1123|2175->1128|2443->1360|2479->1380|2519->1382|2614->1441|2630->1448|2657->1453|2720->1480|2736->1487|2764->1493|2836->1529|2851->1535|2910->1572|3068->1698|3135->1734|3170->2125|3211->2144
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|41->18|42->19|42->19|42->19|46->23|46->23|53->30|53->30|53->30|54->31|54->31|54->31|65->42|65->42|65->42|68->45|68->45|68->45|69->46|69->46|69->46|70->47|70->47|70->47|74->51|78->55|82->76|85->79
                    -- GENERATED --
                */
            