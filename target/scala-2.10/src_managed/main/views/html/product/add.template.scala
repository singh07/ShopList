
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
object add extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[Product],Form[Product],String,List[models.Product],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(products: List[Product], addProductForm: Form[Product],category:String,prod:List[models.Product]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.100*/("""

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
    
    def render(products:List[Product],addProductForm:Form[Product],category:String,prod:List[models.Product]): play.api.templates.HtmlFormat.Appendable = apply(products,addProductForm,category,prod)
    
    def f:((List[Product],Form[Product],String,List[models.Product]) => play.api.templates.HtmlFormat.Appendable) = (products,addProductForm,category,prod) => apply(products,addProductForm,category,prod)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 22 22:49:44 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/product/add.scala.html
                    HASH: cbee16fcc29cbd260638745484b682d589d5733d
                    MATRIX: 829->1|1072->99|1100->152|1136->154|1169->179|1208->181|1314->546|1392->588|1407->594|1454->619|1800->929|1830->937|1979->1050|1992->1054|2021->1061|2084->1089|2114->1110|2157->1115|2425->1347|2461->1367|2501->1369|2596->1428|2612->1435|2639->1440|2702->1467|2718->1474|2746->1480|2838->1540|2905->1576|2940->1967|2981->1986
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|41->18|42->19|42->19|42->19|46->23|46->23|53->30|53->30|53->30|54->31|54->31|54->31|65->42|65->42|65->42|68->45|68->45|68->45|69->46|69->46|69->46|74->51|78->55|82->76|85->79
                    -- GENERATED --
                */
            