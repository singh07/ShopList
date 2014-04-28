
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
<legend><h2>"""),_display_(Seq[Any](/*6.14*/result/*6.20*/.shops.size)),format.raw/*6.31*/(""" shop(s) found</h2></legend>

"""),_display_(Seq[Any](/*8.2*/for(shop <- result.shops) yield /*8.27*/ {_display_(Seq[Any](format.raw/*8.29*/("""
       """),format.raw/*18.75*/("""

<div class="page-header">
    <a href=""""),_display_(Seq[Any](/*21.15*/routes/*21.21*/.ShopController.profileFound(shop.id))),format.raw/*21.58*/("""">
        <h2>"""),_display_(Seq[Any](/*22.14*/shop/*22.18*/.name)),format.raw/*22.23*/(""" <small>"""),_display_(Seq[Any](/*22.32*/shop/*22.36*/.addressLine1)),format.raw/*22.49*/(""","""),_display_(Seq[Any](/*22.51*/shop/*22.55*/.city)),format.raw/*22.60*/(""","""),_display_(Seq[Any](/*22.62*/shop/*22.66*/.town)),format.raw/*22.71*/("""</small></h2>  </a>
</div>



    """)))})),format.raw/*27.6*/("""
""")))})))}
    }
    
    def render(result:viewmodels.SearchResult): play.api.templates.HtmlFormat.Appendable = apply(result)
    
    def f:((viewmodels.SearchResult) => play.api.templates.HtmlFormat.Appendable) = (result) => apply(result)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 28 20:44:14 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/search/results.scala.html
                    HASH: 8be0061603eb4e0ea09eca97354984c28b55bd3f
                    MATRIX: 800->1|943->34|971->53|1007->55|1041->81|1080->83|1129->97|1143->103|1175->114|1240->145|1280->170|1319->172|1355->620|1433->662|1448->668|1507->705|1559->721|1572->725|1599->730|1644->739|1657->743|1692->756|1730->758|1743->762|1770->767|1808->769|1821->773|1848->778|1914->813
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|37->18|40->21|40->21|40->21|41->22|41->22|41->22|41->22|41->22|41->22|41->22|41->22|41->22|41->22|41->22|41->22|46->27
                    -- GENERATED --
                */
            