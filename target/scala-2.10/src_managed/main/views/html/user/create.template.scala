
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
object create extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.Member],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signupForm: Form[models.Member]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*5.2*/title/*5.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.11*/("""
Sign Up
""")))};
Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*7.2*/("""

"""),_display_(Seq[Any](/*9.2*/main(title,nav="signUp")/*9.26*/ {_display_(Seq[Any](format.raw/*9.28*/("""

    """),_display_(Seq[Any](/*11.6*/form(action = routes.UserController.submit(), 'id -> "userCreationForm", 'class -> "form-horizontal", 'role->"form")/*11.122*/ {_display_(Seq[Any](format.raw/*11.124*/("""
        <fieldset>
           <legend><h1> Account Information</h1></legend>

<div class="form-group">
            """),_display_(Seq[Any](/*16.14*/inputText(signupForm("firstName"),
            '_label -> "First name:",
            'class -> "form-control",
            '_help -> "Please enter your first name."))),format.raw/*19.55*/("""
            </div>

<div class="form-group">
            """),_display_(Seq[Any](/*23.14*/inputText(signupForm("lastName"),
            '_label -> "Last name:",
            'class -> "form-control",
            '_help -> "Please enter your last name."))),format.raw/*26.54*/("""
            </div>

<div class="form-group">
            """),_display_(Seq[Any](/*30.14*/inputText(signupForm("email"),
                        '_label -> "Email Address:",
                        'class -> "form-control",
                        '_help -> "Enter a valid email address.",
                        '_error -> signupForm.globalError))),format.raw/*34.59*/("""
                        </div>

<div class="form-group">
            """),_display_(Seq[Any](/*38.14*/inputPassword(signupForm("password"),
                            '_label -> "Password:",
                            'class -> "form-control",
                            '_help -> "A password must be at least 6 characters."))),format.raw/*41.83*/("""
                            </div>
        </fieldset>

        <div class="form-group">
            <input type="submit" class="btn btn-primary" value="Sign Up">
            <a href=""""),_display_(Seq[Any](/*47.23*/routes/*47.29*/.ApplicationController.index)),format.raw/*47.57*/("""" class="btn">Cancel</a>
        </div>
    """)))})),format.raw/*49.6*/("""

""")))})),format.raw/*51.2*/("""
"""))}
    }
    
    def render(signupForm:Form[models.Member]): play.api.templates.HtmlFormat.Appendable = apply(signupForm)
    
    def f:((Form[models.Member]) => play.api.templates.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 27 15:42:11 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/user/create.scala.html
                    HASH: 92b7086593a9c7a397adb76e372bc5510153df45
                    MATRIX: 793->1|955->92|967->97|1051->101|1102->34|1132->113|1171->118|1203->142|1242->144|1286->153|1412->269|1453->271|1611->393|1801->561|1900->624|2087->789|2186->852|2470->1114|2581->1189|2832->1418|3060->1610|3075->1616|3125->1644|3203->1691|3239->1696
                    LINES: 26->1|31->5|31->5|33->5|36->1|38->7|40->9|40->9|40->9|42->11|42->11|42->11|47->16|50->19|54->23|57->26|61->30|65->34|69->38|72->41|78->47|78->47|78->47|80->49|82->51
                    -- GENERATED --
                */
            