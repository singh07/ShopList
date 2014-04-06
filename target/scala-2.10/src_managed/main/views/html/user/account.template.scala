
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
object account extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[viewmodels.Login,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: viewmodels.Login):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Html("Shop Details"))/*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""

<h2>User Details</h2>

<p><b>Welcome </b>"""),_display_(Seq[Any](/*10.20*/user/*10.24*/.email)),format.raw/*10.30*/("""</p>

""")))})))}
    }
    
    def render(user:viewmodels.Login): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((viewmodels.Login) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 19:25:32 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/user/account.scala.html
                    HASH: dcf12ddffdb6fa42d8c02f3414d5124f2130ce9c
                    MATRIX: 791->1|959->25|987->78|1023->80|1057->106|1096->108|1176->152|1189->156|1217->162
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|39->10|39->10|39->10
                    -- GENERATED --
                */
            