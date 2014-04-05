
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
object create extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[models.Shop],Map[String, String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[models.Shop], users:Map[String, String] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*5.1*/("""

"""),_display_(Seq[Any](/*7.2*/main(Html("Create Shop"))/*7.27*/ {_display_(Seq[Any](format.raw/*7.29*/("""

"""),_display_(Seq[Any](/*9.2*/if(session.get("email")==null)/*9.32*/{_display_(Seq[Any](format.raw/*9.33*/("""

<div class="alert alert-danger"><p><strong>Warning!</strong>&nbsp;To add a shop please login first.</p>  </div>
""")))}/*12.2*/else/*12.6*/{_display_(Seq[Any](format.raw/*12.7*/("""
<fieldset>
    <legend>Add a new shop</legend>
     <p>To add a shop to this website fill in the form given below.Add as much information about your shop so the customer may know abot your shop more.</p>


"""),_display_(Seq[Any](/*18.2*/form(action = routes.ShopController.submit(), 'id -> "shopCreationForm", 'class -> "form-horizontal", 'role->"form")/*18.118*/ {_display_(Seq[Any](format.raw/*18.120*/("""

"""),_display_(Seq[Any](/*20.2*/inputText(userForm("name"), '_label -> "Shop Name",'class -> "form-control"))),format.raw/*20.78*/("""
"""),_display_(Seq[Any](/*21.2*/inputText(userForm("addressLine1"), '_label -> "Address Line 1",'class -> "form-control"))),format.raw/*21.91*/("""
"""),_display_(Seq[Any](/*22.2*/inputText(userForm("addressLine2"), '_label -> "Address Line 2",'class -> "form-control"))),format.raw/*22.91*/("""
"""),_display_(Seq[Any](/*23.2*/inputText(userForm("addressLine3"), '_label -> "Address Line 3",'class -> "form-control"))),format.raw/*23.91*/("""
"""),_display_(Seq[Any](/*24.2*/inputText(userForm("city"), '_label -> "City",'class -> "form-control"))),format.raw/*24.73*/("""
"""),_display_(Seq[Any](/*25.2*/inputText(userForm("town"), '_label -> "Town",'class -> "form-control"))),format.raw/*25.73*/("""
"""),_display_(Seq[Any](/*26.2*/inputText(userForm("phoneNumber"), '_label -> "Phone",'class -> "form-control"))),format.raw/*26.81*/("""
"""),_display_(Seq[Any](/*27.2*/inputText(userForm("owner.email"), '_label -> "Owner Email" ,'id -> "createdOn",'class -> "form-control",'readonly ->"readonly",'placeholder ->session.get("email") ))),format.raw/*27.167*/("""
"""),format.raw/*36.5*/("""

    <div class="actions">
        <input type="submit" class="btn btn-primary" value="Create">
        <a href=""""),_display_(Seq[Any](/*40.19*/routes/*40.25*/.ApplicationController.index)),format.raw/*40.53*/("""" class="btn">Cancel</a>
    </div>

""")))})),format.raw/*43.2*/("""
</fieldset>
        """)))})),format.raw/*45.10*/("""
        """)))})))}
    }
    
    def render(userForm:Form[models.Shop],users:Map[String, String]): play.api.templates.HtmlFormat.Appendable = apply(userForm,users)
    
    def f:((Form[models.Shop],Map[String, String]) => play.api.templates.HtmlFormat.Appendable) = (userForm,users) => apply(userForm,users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 01 22:26:25 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/shop/create.scala.html
                    HASH: 09b7809a16363993beeff9ac73bbc4bff1de5c6f
                    MATRIX: 811->1|1012->58|1040->111|1077->114|1110->139|1149->141|1186->144|1224->174|1262->175|1395->290|1407->294|1445->295|1688->503|1814->619|1855->621|1893->624|1991->700|2028->702|2139->791|2176->793|2287->882|2324->884|2435->973|2472->975|2565->1046|2602->1048|2695->1119|2732->1121|2833->1200|2870->1202|3058->1367|3086->1643|3237->1758|3252->1764|3302->1792|3371->1830|3425->1852
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|38->9|38->9|38->9|41->12|41->12|41->12|47->18|47->18|47->18|49->20|49->20|50->21|50->21|51->22|51->22|52->23|52->23|53->24|53->24|54->25|54->25|55->26|55->26|56->27|56->27|57->36|61->40|61->40|61->40|64->43|66->45
                    -- GENERATED --
                */
            