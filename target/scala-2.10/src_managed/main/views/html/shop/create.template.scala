
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

<fieldset>
    <legend>Add a new shop</legend>
     <p>To add a shop to this website fill in the form given below.Add as much information about your shop so the customer may know abot your shop more.</p>


"""),_display_(Seq[Any](/*19.2*/form(action = routes.ShopController.submit(), 'id -> "shopCreationForm", 'class -> "form-horizontal", 'role->"form")/*19.118*/ {_display_(Seq[Any](format.raw/*19.120*/("""
"""),format.raw/*49.3*/("""


"""),_display_(Seq[Any](/*52.2*/inputText(userForm("name"), '_label -> "Shop Name",'class -> "form-control"))),format.raw/*52.78*/("""
"""),_display_(Seq[Any](/*53.2*/inputText(userForm("addressLine1"), '_label -> "Address Line 1",'class -> "form-control"))),format.raw/*53.91*/("""
"""),_display_(Seq[Any](/*54.2*/inputText(userForm("addressLine2"), '_label -> "Address Line 2",'class -> "form-control"))),format.raw/*54.91*/("""
"""),_display_(Seq[Any](/*55.2*/inputText(userForm("addressLine3"), '_label -> "Address Line 3",'class -> "form-control"))),format.raw/*55.91*/("""
"""),_display_(Seq[Any](/*56.2*/inputText(userForm("city"), '_label -> "City",'class -> "form-control"))),format.raw/*56.73*/("""
"""),_display_(Seq[Any](/*57.2*/inputText(userForm("town"), '_label -> "Town",'class -> "form-control"))),format.raw/*57.73*/("""
"""),_display_(Seq[Any](/*58.2*/inputText(userForm("phoneNumber"), '_label -> "Phone",'class -> "form-control"))),format.raw/*58.81*/("""



<div class="form-group">
    <label for="exampleInputEmail1">Owner Email</label>
    <input type="email" class="form-control" id="exampleInputEmail1"  value=""""),_display_(Seq[Any](/*64.79*/user)),format.raw/*64.83*/("""" placeholder=""""),_display_(Seq[Any](/*64.99*/user)),format.raw/*64.103*/("""" readonly>
  </div>

"""),format.raw/*76.5*/("""

    <div class="actions">
        <input type="submit" class="btn btn-primary" value="Create">
        <a href=""""),_display_(Seq[Any](/*80.19*/routes/*80.25*/.ApplicationController.index)),format.raw/*80.53*/("""" class="btn">Cancel</a>
    </div>


</fieldset>
        """)))})),format.raw/*85.10*/("""
        """)))})))}
    }
    
    def render(userForm:Form[models.Shop],user:String): play.api.templates.HtmlFormat.Appendable = apply(userForm,user)
    
    def f:((Form[models.Shop],String) => play.api.templates.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 22:25:33 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/shop/create.scala.html
                    HASH: 11d6c19bac4a1747af51e951c64490d099e715fc
                    MATRIX: 798->1|987->44|1017->101|1056->106|1089->131|1128->133|1159->296|1410->512|1536->628|1577->630|1606->1645|1648->1652|1746->1728|1784->1731|1895->1820|1933->1823|2044->1912|2082->1915|2193->2004|2231->2007|2324->2078|2362->2081|2455->2152|2493->2155|2594->2234|2799->2403|2825->2407|2877->2423|2904->2427|2956->2884|3111->3003|3126->3009|3176->3037|3272->3101
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|38->12|45->19|45->19|45->19|46->49|49->52|49->52|50->53|50->53|51->54|51->54|52->55|52->55|53->56|53->56|54->57|54->57|55->58|55->58|61->64|61->64|61->64|61->64|64->76|68->80|68->80|68->80|73->85
                    -- GENERATED --
                */
            