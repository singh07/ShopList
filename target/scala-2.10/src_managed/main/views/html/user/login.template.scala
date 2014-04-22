
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

def /*5.2*/title/*5.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.11*/("""
Sign In
""")))};
Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*7.2*/("""

"""),_display_(Seq[Any](/*9.2*/main(title,nav="signIn")/*9.26*/ {_display_(Seq[Any](format.raw/*9.28*/("""

"""),_display_(Seq[Any](/*11.2*/form(action = routes.UserController.authenticate(), 'id -> "userCreationForm", 'class -> "form-horizontal", 'role->"form")/*11.124*/ {_display_(Seq[Any](format.raw/*11.126*/("""
<fieldset>
    <legend><h1>LogIn</h1></legend>

<div class="form-group">
    """),_display_(Seq[Any](/*16.6*/inputText(login("email"),
    '_label -> "Email Address:",
    'class -> "form-control",
    'placeholder -> "Enter email address.",
    '_error -> login.globalError))),format.raw/*20.34*/("""
</div>
<div class="form-group">
    """),_display_(Seq[Any](/*23.6*/inputPassword(login("password"),
    '_label -> "Password:",
    'class -> "form-control",
    'placeholder -> "Enter password"))),format.raw/*26.38*/("""
    </div>
</fieldset>

   <div class="form-group">
     <input type="submit" class="btn btn-primary" value="Log In">
     <a href=""""),_display_(Seq[Any](/*32.16*/routes/*32.22*/.ApplicationController.index)),format.raw/*32.50*/("""" class="btn">Cancel</a>
   </div>
""")))})),format.raw/*34.2*/("""

""")))})),format.raw/*36.2*/("""
"""))}
    }
    
    def render(login:Form[viewmodels.Login]): play.api.templates.HtmlFormat.Appendable = apply(login)
    
    def f:((Form[viewmodels.Login]) => play.api.templates.HtmlFormat.Appendable) = (login) => apply(login)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 20 13:09:41 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/user/login.scala.html
                    HASH: 7b8cb19636ba7af19e16615dd746c35b62741f88
                    MATRIX: 795->1|953->86|965->91|1049->95|1098->32|1126->105|1163->108|1195->132|1234->134|1272->137|1404->259|1445->261|1559->340|1747->506|1820->544|1970->672|2140->806|2155->812|2205->840|2272->876|2306->879
                    LINES: 26->1|31->5|31->5|33->5|36->1|38->7|40->9|40->9|40->9|42->11|42->11|42->11|47->16|51->20|54->23|57->26|63->32|63->32|63->32|65->34|67->36
                    -- GENERATED --
                */
            