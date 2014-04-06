
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


Seq[Any](format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(Html("About"))/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
  <fieldset>

<legend>About us</legend>
       <p>
   Welcome to ShopDirectory , the website helps to advertise shops and similar to search shops all on one website.Small shops,
    and other similar shops have become very popular, with cheap clothing and items for anyone to purchase, you might be surprised by
    the prise you can get.This website is for you to help locate shops, and also to search shops. </p>
   <p>  To add a shop create a user acconunt by sighning up and then creating a shop by clicking add shop link.</p>
   <p> If there is a shop you know of thats not on the site, please let me know via the add shop page on the site.
    This site wouldnt exist without the support and help from people like you.
</p>
  </fieldset>
""")))})),format.raw/*18.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 19:25:31 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/about.scala.html
                    HASH: 133207cea48e5a8538d811bebbe46adb21b9d69c
                    MATRIX: 907->55|944->58|971->77|1010->79|1800->838
                    LINES: 32->4|33->5|33->5|33->5|46->18
                    -- GENERATED --
                */
            