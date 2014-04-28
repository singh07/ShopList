
package views.html.shop

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
object create extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[models.Shop],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[models.Shop], user: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*5.2*/title/*5.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.11*/("""
Add Shop
""")))};
Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*7.2*/("""

"""),_display_(Seq[Any](/*9.2*/main(title,nav="addShop")/*9.27*/ {_display_(Seq[Any](format.raw/*9.29*/("""

"""),_display_(Seq[Any](/*11.2*/if(session.get("email")==null)/*11.32*/{_display_(Seq[Any](format.raw/*11.33*/("""

<div class="alert alert-danger"><p><strong>Warning!</strong>&nbsp;To add a shop please login first.</p>  </div>
""")))}/*14.2*/else/*14.6*/{_display_(Seq[Any](format.raw/*14.7*/("""
<fieldset>
    <legend>Add a new shop</legend>
     <p>To add a shop to this website fill in the form given below.Add as much information about your shop so the customer may know abot your shop more.</p>


"""),_display_(Seq[Any](/*20.2*/form(action = routes.ShopController.submit(), 'id -> "shopCreationForm", 'class -> "form-horizontal", 'role->"form")/*20.118*/ {_display_(Seq[Any](format.raw/*20.120*/("""

"""),_display_(Seq[Any](/*22.2*/inputText(userForm("name"), '_label -> "Shop Name",'class -> "form-control"))),format.raw/*22.78*/("""
"""),_display_(Seq[Any](/*23.2*/inputText(userForm("addressLine1"), '_label -> "Address Line 1",'class -> "form-control"))),format.raw/*23.91*/("""
"""),_display_(Seq[Any](/*24.2*/inputText(userForm("addressLine2"), '_label -> "Address Line 2",'class -> "form-control"))),format.raw/*24.91*/("""
"""),_display_(Seq[Any](/*25.2*/inputText(userForm("addressLine3"), '_label -> "Address Line 3",'class -> "form-control"))),format.raw/*25.91*/("""
"""),_display_(Seq[Any](/*26.2*/inputText(userForm("city"), '_label -> "City",'class -> "form-control"))),format.raw/*26.73*/("""
"""),_display_(Seq[Any](/*27.2*/inputText(userForm("town"), '_label -> "Town",'class -> "form-control"))),format.raw/*27.73*/("""
"""),_display_(Seq[Any](/*28.2*/inputText(userForm("phoneNumber"), '_label -> "Phone",'class -> "form-control"))),format.raw/*28.81*/("""

      <div >
        <label>Category</label>
        <select name="category" class="form-control" id="select1" >
            <option value="">-:Select Category:-&nbsp;</option>
            <option value="antique shop">antique shop</option>
            <option value="barbershop">barbershop</option>
            <option value="beauty parlour">beauty parlour</option>
            <option value="beauty salon">beauty salon</option>
            <option value="big-box store">big-box store</option>
            <option value="bookshop">bookshop</option>
            <option value="bottle shop">bottle shop</option>
            <option value="chemist">chemist</option>
            <option value="dairy">dairy</option>
            <option value="garage">garage</option>
            <option value="general store">general store</option>
            <option value="hardware shop">hardware shop</option>
            <option value="supermarket">supermarket</option>
            <option value="sweet shop">sweet shop</option>



        </select>
    </div>
      <br>
    <div>
        <label >Owner Email</label>
        <input type="email" name="owner.email" class="form-control" id="exampleInputEmail1" value=""""),_display_(Seq[Any](/*56.101*/user)),format.raw/*56.105*/("""" placeholder=""""),_display_(Seq[Any](/*56.121*/user)),format.raw/*56.125*/("""" readonly>
    </div>

</fieldset>
    """),format.raw/*73.15*/("""
    <div class="actions">
        <input type="submit" class="btn btn-primary" value="Create">
        <a href=""""),_display_(Seq[Any](/*76.19*/routes/*76.25*/.ApplicationController.index)),format.raw/*76.53*/("""" class="btn">Cancel</a>
    </div>

""")))})),format.raw/*79.2*/("""

        """)))})),format.raw/*81.10*/("""
        """)))})))}
    }
    
    def render(userForm:Form[models.Shop],user:String): play.api.templates.HtmlFormat.Appendable = apply(userForm,user)
    
    def f:((Form[models.Shop],String) => play.api.templates.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 29 04:59:10 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/shop/create.scala.html
                    HASH: f0fc0b8275c80e3e19e855abf250ef74fc4fcbbb
                    MATRIX: 798->1|970->102|982->107|1066->111|1118->44|1148->124|1187->129|1220->154|1259->156|1299->161|1338->191|1377->192|1513->310|1525->314|1563->315|1812->529|1938->645|1979->647|2019->652|2117->728|2155->731|2266->820|2304->823|2415->912|2453->915|2564->1004|2602->1007|2695->1078|2733->1081|2826->1152|2864->1155|2965->1234|4234->2466|4261->2470|4314->2486|4341->2490|4413->3084|4566->3201|4581->3207|4631->3235|4703->3276|4748->3289
                    LINES: 26->1|31->5|31->5|33->5|36->1|38->7|40->9|40->9|40->9|42->11|42->11|42->11|45->14|45->14|45->14|51->20|51->20|51->20|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|57->26|57->26|58->27|58->27|59->28|59->28|87->56|87->56|87->56|87->56|91->73|94->76|94->76|94->76|97->79|99->81
                    -- GENERATED --
                */
            