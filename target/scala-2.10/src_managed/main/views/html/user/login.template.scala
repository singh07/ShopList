
package views.html.user

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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[viewmodels.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(login: Form[viewmodels.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Html("Create User"))/*6.27*/ {_display_(Seq[Any](format.raw/*6.29*/("""

"""),_display_(Seq[Any](/*8.2*/form(action = routes.UserController.authenticate(), 'id -> "userCreationForm", 'class -> "form-horizontal", 'role->"form")/*8.124*/ {_display_(Seq[Any](format.raw/*8.126*/("""
<fieldset>
    <legend><h1>LogIn</h1></legend>

<div class="form-group">
    """),_display_(Seq[Any](/*13.6*/inputText(login("email"),
    '_label -> "Email Address:",
    'class -> "form-control",
    'placeholder -> "Enter email address.",
    '_error -> login.globalError))),format.raw/*17.34*/("""
</div>
<div class="form-group">
    """),_display_(Seq[Any](/*20.6*/inputPassword(login("password"),
    '_label -> "Password:",
    'class -> "form-control",
    'placeholder -> "Enter password"))),format.raw/*23.38*/("""
    </div>
</fieldset>

   <div class="form-group">
     <input type="submit" class="btn btn-primary" value="Log In">
     <a href=""""),_display_(Seq[Any](/*29.16*/routes/*29.22*/.ApplicationController.index)),format.raw/*29.50*/("""" class="btn">Cancel</a>
   </div>
""")))})),format.raw/*31.2*/("""

""")))})),format.raw/*33.2*/("""
"""))}
    }
    
    def render(login:Form[viewmodels.Login]): play.api.templates.HtmlFormat.Appendable = apply(login)
    
    def f:((Form[viewmodels.Login]) => play.api.templates.HtmlFormat.Appendable) = (login) => apply(login)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 12 22:16:31 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/user/login.scala.html
                    HASH: 14dd452f89d9110b942aea688fb9d4ad1c3e637d
                    MATRIX: 795->1|970->32|998->85|1034->87|1067->112|1106->114|1143->117|1274->239|1314->241|1428->320|1616->486|1689->524|1839->652|2009->786|2024->792|2074->820|2141->856|2175->859
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|37->8|42->13|46->17|49->20|52->23|58->29|58->29|58->29|60->31|62->33
                    -- GENERATED --
                */
            