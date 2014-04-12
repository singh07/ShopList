
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


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Html("Create User"))/*6.27*/ {_display_(Seq[Any](format.raw/*6.29*/("""

    """),_display_(Seq[Any](/*8.6*/form(action = routes.UserController.submit(), 'id -> "userCreationForm", 'class -> "form-horizontal", 'role->"form")/*8.122*/ {_display_(Seq[Any](format.raw/*8.124*/("""
        <fieldset>
           <legend><h1> Account Information</h1></legend>

<div class="form-group">
            """),_display_(Seq[Any](/*13.14*/inputText(signupForm("firstName"),
            '_label -> "First name:",
            'class -> "form-control",
            '_help -> "Please enter your first name."))),format.raw/*16.55*/("""
            </div>

<div class="form-group">
            """),_display_(Seq[Any](/*20.14*/inputText(signupForm("lastName"),
            '_label -> "Last name:",
            'class -> "form-control",
            '_help -> "Please enter your last name."))),format.raw/*23.54*/("""
            </div>

<div class="form-group">
            """),_display_(Seq[Any](/*27.14*/inputText(signupForm("email"),
                        '_label -> "Email Address:",
                        'class -> "form-control",
                        '_help -> "Enter a valid email address.",
                        '_error -> signupForm.globalError))),format.raw/*31.59*/("""
                        </div>

<div class="form-group">
            """),_display_(Seq[Any](/*35.14*/inputPassword(signupForm("password"),
                            '_label -> "Password:",
                            'class -> "form-control",
                            '_help -> "A password must be at least 6 characters."))),format.raw/*38.83*/("""
                            </div>
        </fieldset>

        <div class="form-group">
            <input type="submit" class="btn btn-primary" value="Sign Up">
            <a href=""""),_display_(Seq[Any](/*44.23*/routes/*44.29*/.ApplicationController.index)),format.raw/*44.57*/("""" class="btn">Cancel</a>
        </div>
    """)))})),format.raw/*46.6*/("""

""")))})),format.raw/*48.2*/("""
"""))}
    }
    
    def render(signupForm:Form[models.Member]): play.api.templates.HtmlFormat.Appendable = apply(signupForm)
    
    def f:((Form[models.Member]) => play.api.templates.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 12 22:27:20 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/user/create.scala.html
                    HASH: 88e058bb9b95f4f4440d981edc894f3c4ca6893d
                    MATRIX: 793->1|972->34|1002->91|1039->94|1072->119|1111->121|1154->130|1279->246|1319->248|1477->370|1667->538|1766->601|1953->766|2052->829|2336->1091|2447->1166|2698->1395|2926->1587|2941->1593|2991->1621|3069->1668|3105->1673
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|37->8|42->13|45->16|49->20|52->23|56->27|60->31|64->35|67->38|73->44|73->44|73->44|75->46|77->48
                    -- GENERATED --
                */
            