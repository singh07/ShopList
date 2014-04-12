
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


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*5.1*/("""

"""),_display_(Seq[Any](/*7.2*/main(Html("Create Shop"))/*7.27*/ {_display_(Seq[Any](format.raw/*7.29*/("""

"""),format.raw/*12.9*/("""

 """),_display_(Seq[Any](/*14.3*/if(flash.size() > 0)/*14.23*/{_display_(Seq[Any](format.raw/*14.24*/("""
      <div class="alert-alert error">
          """),_display_(Seq[Any](/*16.12*/for((key, value) <- flash) yield /*16.38*/{_display_(Seq[Any](format.raw/*16.39*/("""
              <strong>Error : </strong> """),_display_(Seq[Any](/*17.42*/value)),format.raw/*17.47*/("""<br />
          """)))})),format.raw/*18.12*/("""
      </div> 
  """)))})),format.raw/*20.4*/("""




<fieldset>
    <legend>Add a new shop</legend>
     <p>To add a shop to this website fill in the form given below.Add as much information about your shop so the customer may know abot your shop more.</p>


"""),_display_(Seq[Any](/*30.2*/form(action = routes.ShopController.submit(), 'id -> "shopCreationForm", 'class -> "form-horizontal", 'role->"form")/*30.118*/ {_display_(Seq[Any](format.raw/*30.120*/("""
"""),format.raw/*60.3*/("""


"""),_display_(Seq[Any](/*63.2*/inputText(userForm("name"), '_label -> "Shop Name",'class -> "form-control"))),format.raw/*63.78*/("""
"""),_display_(Seq[Any](/*64.2*/inputText(userForm("addressLine1"), '_label -> "Address Line 1",'class -> "form-control"))),format.raw/*64.91*/("""
"""),_display_(Seq[Any](/*65.2*/inputText(userForm("addressLine2"), '_label -> "Address Line 2",'class -> "form-control"))),format.raw/*65.91*/("""
"""),_display_(Seq[Any](/*66.2*/inputText(userForm("addressLine3"), '_label -> "Address Line 3",'class -> "form-control"))),format.raw/*66.91*/("""
"""),_display_(Seq[Any](/*67.2*/inputText(userForm("city"), '_label -> "City",'class -> "form-control"))),format.raw/*67.73*/("""
"""),_display_(Seq[Any](/*68.2*/inputText(userForm("town"), '_label -> "Town",'class -> "form-control"))),format.raw/*68.73*/("""
"""),_display_(Seq[Any](/*69.2*/inputText(userForm("phoneNumber"), '_label -> "Phone",'class -> "form-control"))),format.raw/*69.81*/("""

<div class="form-group">
    <label for="exampleInputEmail1">Owner Email</label>
    <input type="email" name="owner.email" class="form-control" id="exampleInputEmail1" value=""""),_display_(Seq[Any](/*73.97*/user)),format.raw/*73.101*/("""" placeholder=""""),_display_(Seq[Any](/*73.117*/user)),format.raw/*73.121*/("""" readonly>
  </div>

"""),format.raw/*87.3*/("""

    <div class="actions">
        <input type="submit" class="btn btn-primary" value="Create">
        <a href=""""),_display_(Seq[Any](/*91.19*/routes/*91.25*/.ApplicationController.index)),format.raw/*91.53*/("""" class="btn">Cancel</a>
    </div>


</fieldset>
        """)))})),format.raw/*96.10*/("""
        """)))})))}
    }
    
    def render(userForm:Form[models.Shop],user:String): play.api.templates.HtmlFormat.Appendable = apply(userForm,user)
    
    def f:((Form[models.Shop],String) => play.api.templates.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 12 12:59:01 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/shop/create.scala.html
                    HASH: 8b5ec949fc043ab97daa2f0dd18d37921c2a8d44
                    MATRIX: 798->1|987->44|1017->101|1056->106|1089->131|1128->133|1159->296|1200->302|1229->322|1268->323|1356->375|1398->401|1437->402|1516->445|1543->450|1594->469|1645->489|1902->711|2028->827|2069->829|2098->1844|2140->1851|2238->1927|2276->1930|2387->2019|2425->2022|2536->2111|2574->2114|2685->2203|2723->2206|2816->2277|2854->2280|2947->2351|2985->2354|3086->2433|3305->2616|3332->2620|3385->2636|3412->2640|3464->3115|3619->3234|3634->3240|3684->3268|3780->3332
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|38->12|40->14|40->14|40->14|42->16|42->16|42->16|43->17|43->17|44->18|46->20|56->30|56->30|56->30|57->60|60->63|60->63|61->64|61->64|62->65|62->65|63->66|63->66|64->67|64->67|65->68|65->68|66->69|66->69|70->73|70->73|70->73|70->73|73->87|77->91|77->91|77->91|82->96
                    -- GENERATED --
                */
            