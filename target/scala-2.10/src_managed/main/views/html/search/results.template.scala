
package views.html.search

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
object results extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[viewmodels.SearchResult,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(result: viewmodels.SearchResult):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(Html("Shop Details"))/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    """),_display_(Seq[Any](/*6.6*/for(shop <- result.shops) yield /*6.31*/ {_display_(Seq[Any](format.raw/*6.33*/("""
        <h2>Shop Details</h2>

        <p><b>Shop Name: </b>"""),_display_(Seq[Any](/*9.31*/shop/*9.35*/.name)),format.raw/*9.40*/("""</p>
        <p><b>Address Line 1: </b>"""),_display_(Seq[Any](/*10.36*/shop/*10.40*/.addressLine1)),format.raw/*10.53*/("""</p>
        <p><b>Address Line 2: </b>"""),_display_(Seq[Any](/*11.36*/shop/*11.40*/.addressLine2)),format.raw/*11.53*/("""</p>
        <p><b>Address Line 3: </b>"""),_display_(Seq[Any](/*12.36*/shop/*12.40*/.addressLine3)),format.raw/*12.53*/("""</p>
        <p><b>City: </b>"""),_display_(Seq[Any](/*13.26*/shop/*13.30*/.city)),format.raw/*13.35*/("""</p>
        <p><b>Town: </b>"""),_display_(Seq[Any](/*14.26*/shop/*14.30*/.town)),format.raw/*14.35*/("""</p>
        <p><b>Phone: </b>"""),_display_(Seq[Any](/*15.27*/shop/*15.31*/.phoneNumber)),format.raw/*15.43*/("""</p>
      """),format.raw/*16.76*/("""
        <p><b>Search Details: </b>"""),_display_(Seq[Any](/*17.36*/result/*17.42*/.criteria)),format.raw/*17.51*/(""" """),_display_(Seq[Any](/*17.53*/result/*17.59*/.keyword)),format.raw/*17.67*/("""</p>
    """)))})),format.raw/*18.6*/("""
""")))})))}
    }
    
    def render(result:viewmodels.SearchResult): play.api.templates.HtmlFormat.Appendable = apply(result)
    
    def f:((viewmodels.SearchResult) => play.api.templates.HtmlFormat.Appendable) = (result) => apply(result)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 01 22:26:25 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/search/results.scala.html
                    HASH: a1ecb52bc3078d555022ac69dbad31a8dfe6ff1c
                    MATRIX: 800->1|943->34|971->53|1007->55|1041->81|1080->83|1120->89|1160->114|1199->116|1296->178|1308->182|1334->187|1410->227|1423->231|1458->244|1534->284|1547->288|1582->301|1658->341|1671->345|1706->358|1772->388|1785->392|1812->397|1878->427|1891->431|1918->436|1985->467|1998->471|2032->483|2071->563|2143->599|2158->605|2189->614|2227->616|2242->622|2272->630|2313->640
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|45->17|45->17|45->17|45->17|45->17|45->17|46->18
                    -- GENERATED --
                */
            