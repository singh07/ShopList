
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

"""),_display_(Seq[Any](/*21.2*/inputText(userForm("name"), '_label -> "Shop Name",'class -> "form-control"))),format.raw/*21.78*/("""
"""),_display_(Seq[Any](/*22.2*/inputText(userForm("addressLine1"), '_label -> "Address Line 1",'class -> "form-control"))),format.raw/*22.91*/("""
"""),_display_(Seq[Any](/*23.2*/inputText(userForm("addressLine2"), '_label -> "Address Line 2",'class -> "form-control"))),format.raw/*23.91*/("""
"""),_display_(Seq[Any](/*24.2*/inputText(userForm("addressLine3"), '_label -> "Address Line 3",'class -> "form-control"))),format.raw/*24.91*/("""
"""),_display_(Seq[Any](/*25.2*/inputText(userForm("city"), '_label -> "City",'class -> "form-control"))),format.raw/*25.73*/("""
"""),_display_(Seq[Any](/*26.2*/inputText(userForm("town"), '_label -> "Town",'class -> "form-control"))),format.raw/*26.73*/("""
"""),_display_(Seq[Any](/*27.2*/inputText(userForm("phoneNumber"), '_label -> "Phone",'class -> "form-control"))),format.raw/*27.81*/("""
"""),format.raw/*28.155*/("""

<div class="form-group">
    <label for="exampleInputEmail1">Owner Email</label>
    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Owner email" value=""""),_display_(Seq[Any](/*32.104*/user)),format.raw/*32.108*/("""" placeholder=""""),_display_(Seq[Any](/*32.124*/user)),format.raw/*32.128*/("""" readonly>
  </div>

"""),format.raw/*43.5*/("""

    <div class="actions">
        <input type="submit" class="btn btn-primary" value="Create">
        <a href=""""),_display_(Seq[Any](/*47.19*/routes/*47.25*/.ApplicationController.index)),format.raw/*47.53*/("""" class="btn">Cancel</a>
    </div>


</fieldset>
        """)))})),format.raw/*52.10*/("""
        """)))})))}
    }
    
    def render(userForm:Form[models.Shop],user:String): play.api.templates.HtmlFormat.Appendable = apply(userForm,user)
    
    def f:((Form[models.Shop],String) => play.api.templates.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 21:23:50 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/shop/create.scala.html
                    HASH: 8f83937d3d3d035c32a142e90329d14df817a59d
                    MATRIX: 798->1|987->44|1017->101|1056->106|1089->131|1128->133|1159->296|1410->512|1536->628|1577->630|1617->635|1715->711|1753->714|1864->803|1902->806|2013->895|2051->898|2162->987|2200->990|2293->1061|2331->1064|2424->1135|2462->1138|2563->1217|2594->1373|2821->1563|2848->1567|2901->1583|2928->1587|2980->1895|3135->2014|3150->2020|3200->2048|3296->2112
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|38->12|45->19|45->19|45->19|47->21|47->21|48->22|48->22|49->23|49->23|50->24|50->24|51->25|51->25|52->26|52->26|53->27|53->27|54->28|58->32|58->32|58->32|58->32|61->43|65->47|65->47|65->47|70->52
                    -- GENERATED --
                */
            