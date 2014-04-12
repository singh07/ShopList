
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
object display extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.Shop,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(shop: models.Shop):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Html("Shop Details"))/*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""

<h2>Shop Details</h2>

<p><b>Shop Name: </b>"""),_display_(Seq[Any](/*10.23*/shop/*10.27*/.name)),format.raw/*10.32*/("""</p>
<p><b>Address Line 1: </b>"""),_display_(Seq[Any](/*11.28*/shop/*11.32*/.addressLine1)),format.raw/*11.45*/("""</p>
<p><b>Address Line 2: </b>"""),_display_(Seq[Any](/*12.28*/shop/*12.32*/.addressLine2)),format.raw/*12.45*/("""</p>
<p><b>Address Line 3: </b>"""),_display_(Seq[Any](/*13.28*/shop/*13.32*/.addressLine3)),format.raw/*13.45*/("""</p>
<p><b>City: </b>"""),_display_(Seq[Any](/*14.18*/shop/*14.22*/.city)),format.raw/*14.27*/("""</p>
<p><b>Town: </b>"""),_display_(Seq[Any](/*15.18*/shop/*15.22*/.town)),format.raw/*15.27*/("""</p>
<p><b>Phone: </b>"""),_display_(Seq[Any](/*16.19*/shop/*16.23*/.phoneNumber)),format.raw/*16.35*/("""</p>
<p><b>Owner: </b>"""),_display_(Seq[Any](/*17.19*/shop/*17.23*/.owner.firstName)),format.raw/*17.39*/(""" """),_display_(Seq[Any](/*17.41*/shop/*17.45*/.owner.lastName)),format.raw/*17.60*/("""</p>

""")))})))}
    }
    
    def render(shop:models.Shop): play.api.templates.HtmlFormat.Appendable = apply(shop)
    
    def f:((models.Shop) => play.api.templates.HtmlFormat.Appendable) = (shop) => apply(shop)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 12 11:55:22 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/shop/display.scala.html
                    HASH: 638eb36107664ff3d5352e61cdc6be2d33c87bc7
                    MATRIX: 786->1|949->20|977->73|1013->75|1047->101|1086->103|1169->150|1182->154|1209->159|1277->191|1290->195|1325->208|1393->240|1406->244|1441->257|1509->289|1522->293|1557->306|1615->328|1628->332|1655->337|1713->359|1726->363|1753->368|1812->391|1825->395|1859->407|1918->430|1931->434|1969->450|2007->452|2020->456|2057->471
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|46->17|46->17|46->17
                    -- GENERATED --
                */
            