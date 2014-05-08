
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
      <form class="form-inline" action=""""),_display_(Seq[Any](/*21.42*/routes/*21.48*/.ProductController.save())),format.raw/*21.73*/("""" method="post" onsubmit="return validateForm(this);">
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


<script type="text/javascript" charset="utf-8">
function validateForm(createProduct) """),format.raw/*85.38*/("""{"""),format.raw/*85.39*/("""
var reason = "";

reason += validateProductName(createProduct.name);
reason += validateProductPrice(createProduct.price);


if (reason != "") """),format.raw/*92.19*/("""{"""),format.raw/*92.20*/("""
alert("Some fields need correction:\n" + reason);
return false;
"""),format.raw/*95.1*/("""}"""),format.raw/*95.2*/("""

return true;
"""),format.raw/*98.1*/("""}"""),format.raw/*98.2*/("""


function validateProductName(fld) """),format.raw/*101.35*/("""{"""),format.raw/*101.36*/("""
var error = "";
var illegalChars = /\W/; // allow letters, numbers, and underscores
var letters = /^[A-Za-z]+$/;

if (fld.value == "") """),format.raw/*106.22*/("""{"""),format.raw/*106.23*/("""

error = "You didn't enter a Product Name.\n";

"""),format.raw/*110.1*/("""}"""),format.raw/*110.2*/("""  
return error;
"""),format.raw/*112.1*/("""}"""),format.raw/*112.2*/("""



function validateProductPrice(fld) """),format.raw/*116.36*/("""{"""),format.raw/*116.37*/("""
var error = "";
var stripped = fld.value.replace(/[\(\)\.\-\ ]/g, '');

if (fld.value == "") """),format.raw/*120.22*/("""{"""),format.raw/*120.23*/("""
error = "You didn't enter a product price.\n";

"""),format.raw/*123.1*/("""}"""),format.raw/*123.2*/(""" else if (isNaN(parseInt(stripped))) """),format.raw/*123.39*/("""{"""),format.raw/*123.40*/("""
error = "The product price field contains illegal characters.\n";

"""),format.raw/*126.1*/("""}"""),format.raw/*126.2*/("""
return error;
"""),format.raw/*128.1*/("""}"""),format.raw/*128.2*/("""



</script>





""")))})))}
    }
    
    def render(products:List[Product],addProductForm:Form[Product],category:String,prod:List[models.Product],user_id:Long): play.api.templates.HtmlFormat.Appendable = apply(products,addProductForm,category,prod,user_id)
    
    def f:((List[Product],Form[Product],String,List[models.Product],Long) => play.api.templates.HtmlFormat.Appendable) = (products,addProductForm,category,prod,user_id) => apply(products,addProductForm,category,prod,user_id)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 08 19:21:41 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/product/add.scala.html
                    HASH: b7c541b986d1d1be39d1a5e8d82b16c0fbf79e29
                    MATRIX: 834->1|1090->112|1118->165|1154->167|1187->192|1226->194|1343->275|1358->281|1412->313|1507->667|1585->709|1600->715|1647->740|2031->1088|2061->1096|2210->1209|2223->1213|2252->1220|2315->1248|2345->1269|2388->1274|2656->1506|2692->1526|2732->1528|2827->1587|2843->1594|2870->1599|2933->1626|2949->1633|2977->1639|3049->1675|3064->1681|3123->1718|3281->1844|3348->1880|3383->2271|3424->2290|3540->2378|3569->2379|3740->2522|3769->2523|3861->2588|3889->2589|3931->2604|3959->2605|4025->2642|4055->2643|4220->2779|4250->2780|4327->2829|4356->2830|4401->2847|4430->2848|4498->2887|4528->2888|4651->2982|4681->2983|4758->3032|4787->3033|4853->3070|4883->3071|4979->3139|5008->3140|5051->3155|5080->3156
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|40->11|40->11|40->11|43->20|44->21|44->21|44->21|48->25|48->25|55->32|55->32|55->32|56->33|56->33|56->33|67->44|67->44|67->44|70->47|70->47|70->47|71->48|71->48|71->48|72->49|72->49|72->49|76->53|80->57|84->78|87->81|91->85|91->85|98->92|98->92|101->95|101->95|104->98|104->98|107->101|107->101|112->106|112->106|116->110|116->110|118->112|118->112|122->116|122->116|126->120|126->120|129->123|129->123|129->123|129->123|132->126|132->126|134->128|134->128
                    -- GENERATED --
                */
            