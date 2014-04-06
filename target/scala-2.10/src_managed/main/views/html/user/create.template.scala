
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
            <legend>Account information</legend>


            """),_display_(Seq[Any](/*13.14*/inputText(signupForm("firstName"),
            '_label -> "First name:",
            'class -> "form-control",
            '_help -> "Please enter your first name."))),format.raw/*16.55*/("""

            """),_display_(Seq[Any](/*18.14*/inputText(signupForm("lastName"),
            '_label -> "Last name:",
            'class -> "form-control",
            '_help -> "Please enter your last name."))),format.raw/*21.54*/("""

            """),_display_(Seq[Any](/*23.14*/inputText(signupForm("email"),
                        '_label -> "Email Address:",
                        'class -> "form-control",
                        '_help -> "Enter a valid email address.",
                        '_error -> signupForm.globalError))),format.raw/*27.59*/("""

            """),_display_(Seq[Any](/*29.14*/inputPassword(signupForm("password"),
                            '_label -> "password:",
                            'class -> "form-control",
                            '_help -> "A password must be at least 6 characters."))),format.raw/*32.83*/("""
        </fieldset>

        <div class="actions">
            <input type="submit" class="btn btn-primary" value="Sign Up">
            <a href=""""),_display_(Seq[Any](/*37.23*/routes/*37.29*/.ApplicationController.index)),format.raw/*37.57*/("""" class="btn">Cancel</a>
        </div>
    """)))})),format.raw/*39.6*/("""

""")))})),format.raw/*41.2*/("""
"""))}
    }
    
    def render(signupForm:Form[models.Member]): play.api.templates.HtmlFormat.Appendable = apply(signupForm)
    
    def f:((Form[models.Member]) => play.api.templates.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 19:25:33 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/user/create.scala.html
                    HASH: cf148d06431c5971a5e816a82303df7076badd5f
                    MATRIX: 793->1|972->34|1002->91|1039->94|1072->119|1111->121|1154->130|1279->246|1319->248|1444->337|1634->505|1687->522|1874->687|1927->704|2211->966|2264->983|2515->1212|2704->1365|2719->1371|2769->1399|2847->1446|2883->1451
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|37->8|42->13|45->16|47->18|50->21|52->23|56->27|58->29|61->32|66->37|66->37|66->37|68->39|70->41
                    -- GENERATED --
                */
            