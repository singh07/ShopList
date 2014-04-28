
package views.html

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
object about extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*4.2*/title/*4.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.11*/("""
About
""")))};
Seq[Any](format.raw/*6.2*/("""

"""),_display_(Seq[Any](/*8.2*/main(title,nav="about")/*8.25*/ {_display_(Seq[Any](format.raw/*8.27*/("""
  <fieldset>

<legend><h1>About us</h1></legend>
       <p>
   Welcome to ShopDirectory , the website helps to advertise shops and similar to search shops all on one website.Small shops,
    and other similar shops have become very popular, with cheap clothing and items for anyone to purchase, you might be surprised by
    the prise you can get.This website is for you to help locate shops, and also to search shops. </p>
   <p>  To add a shop create a user acconunt by sighning up and then creating a shop by clicking add shop link.</p>
   <p> If there is a shop you know of thats not on the site, please let me know via the add shop page on the site.
    This site wouldnt exist without the support and help from people like you.
</p>
  </fieldset>
""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 28 20:21:39 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/about.scala.html
                    HASH: 1793a6b62d0e0ceccdf3faab42d4c23ddbe03534
                    MATRIX: 891->56|903->61|987->65|1035->75|1074->80|1105->103|1144->105|1943->873
                    LINES: 31->4|31->4|33->4|36->6|38->8|38->8|38->8|51->21
                    -- GENERATED --
                */
            