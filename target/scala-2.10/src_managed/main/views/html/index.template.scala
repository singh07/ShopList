
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


Seq[Any](format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(Html("Home"))/*5.20*/ {_display_(Seq[Any](format.raw/*5.22*/("""

<!-- Main component for a primary marketing message or call to action -->
<div class="jumbotron">
    <h1>Shop Directory</h1>
    <p>Lets you search a nearby Shop and get to know their location</p>
    <p>Search Shop by Product or Shop name</p>
    <p>
    <form class="form-inline" action=""""),_display_(Seq[Any](/*13.40*/routes/*13.46*/.SearchController.search)),format.raw/*13.70*/("""" method="post">

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
                    DATE: Tue Apr 01 22:26:25 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/index.scala.html
                    HASH: 7106606cce70a971254b9dc5ca8f9cbfdd49a6f6
                    MATRIX: 905->52|941->54|967->72|1006->74|1336->368|1351->374|1397->398
                    LINES: 32->4|33->5|33->5|33->5|41->13|41->13|41->13
                    -- GENERATED --
                */
            