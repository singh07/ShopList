
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*4.2*/title/*4.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.11*/("""
Home
""")))};
Seq[Any](format.raw/*6.2*/("""

"""),_display_(Seq[Any](/*8.2*/main(title,nav="home")/*8.24*/ {_display_(Seq[Any](format.raw/*8.26*/("""

<!-- Main component for a primary marketing message or call to action -->
<div class="jumbotron">
    <h1>Shop Directory</h1>
    <p>Lets you search a nearby Shop and get to know their location</p>
    <p>Search Shop by Product or Shop name</p>
    <p>
    <form class="form-inline" action=""""),_display_(Seq[Any](/*16.40*/routes/*16.46*/.SearchController.search)),format.raw/*16.70*/("""" method="post">

        <input type="text" class="form-inline input-lg" placeholder="Product/Shop name" name="keyword">


   <select class="form-inline input-lg" id="Select1" name="criteria">
        <option value="">--:Select Criteria:--&nbsp;</option>
       <option value="shop">Shop</option>
       <option value="product">Product</option>


   </select>







        <button class="btn btn-lg btn-primary"  role="button">Search</button>

    </form>

    </p>
</div>

</div>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 27 15:42:10 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/index.scala.html
                    HASH: a0dde9612bfb688bc398f7b0244720f9625554eb
                    MATRIX: 889->53|901->58|985->62|1030->69|1067->72|1097->94|1136->96|1466->390|1481->396|1527->420
                    LINES: 31->4|31->4|33->4|36->6|38->8|38->8|38->8|46->16|46->16|46->16
                    -- GENERATED --
                */
            