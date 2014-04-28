
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
    <legend><h1>Sign In</h1></legend>
    
    """),_display_(Seq[Any](/*15.6*/if(flash.contains("success"))/*15.35*/ {_display_(Seq[Any](format.raw/*15.37*/("""
    <p class="bg-success"><h3> """),_display_(Seq[Any](/*16.33*/flash/*16.38*/.get("success"))),format.raw/*16.53*/("""</h3></p>
       
  
""")))})),format.raw/*19.2*/("""

<div class="form-group">
    """),_display_(Seq[Any](/*22.6*/inputText(login("email"),
    '_label -> "Email Address:",
    'class -> "form-control",
    'placeholder -> "Enter email address.",
    '_error -> login.globalError))),format.raw/*26.34*/("""
</div>
<div class="form-group">
    """),_display_(Seq[Any](/*29.6*/inputPassword(login("password"),
    '_label -> "Password:",
    'class -> "form-control",
    'placeholder -> "Enter password"))),format.raw/*32.38*/("""
    </div>
</fieldset>

   <div class="form-group">
     <input type="submit" class="btn btn-primary" value="Log In">
     <a href=""""),_display_(Seq[Any](/*38.16*/routes/*38.22*/.ApplicationController.index)),format.raw/*38.50*/("""" class="btn">Cancel</a>
   </div>
""")))})),format.raw/*40.2*/("""

""")))})),format.raw/*42.2*/("""
"""))}
    }
    
    def render(login:Form[viewmodels.Login]): play.api.templates.HtmlFormat.Appendable = apply(login)
    
    def f:((Form[viewmodels.Login]) => play.api.templates.HtmlFormat.Appendable) = (login) => apply(login)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 29 01:19:14 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/user/login.scala.html
                    HASH: a77b500abda9f11c1ff826f30351a3f854a58ede
                    MATRIX: 795->1|953->86|965->91|1049->95|1098->32|1126->105|1163->108|1195->132|1234->134|1272->137|1404->259|1445->261|1540->321|1578->350|1618->352|1687->385|1701->390|1738->405|1791->427|1858->459|2046->625|2119->663|2269->791|2439->925|2454->931|2504->959|2571->995|2605->998
                    LINES: 26->1|31->5|31->5|33->5|36->1|38->7|40->9|40->9|40->9|42->11|42->11|42->11|46->15|46->15|46->15|47->16|47->16|47->16|50->19|53->22|57->26|60->29|63->32|69->38|69->38|69->38|71->40|73->42
                    -- GENERATED --
                */
            