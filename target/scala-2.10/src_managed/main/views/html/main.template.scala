
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*5.1*/("""

<html>
<head>
    <title>"""),_display_(Seq[Any](/*9.13*/title)),format.raw/*9.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.50*/routes/*10.56*/.Assets.at("dist/css/bootstrap.css"))),format.raw/*10.92*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.50*/routes/*11.56*/.Assets.at("dist/css/bootstrap.min.css"))),format.raw/*11.96*/("""">
   
    <link rel="stylesheet" type="text/css" media="screen" href="stylesheets/bootstrap-select.css">


    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.50*/routes/*16.56*/.Assets.at("dist/css/navbar-fixed-top.css"))),format.raw/*16.99*/("""">

    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*18.55*/routes/*18.61*/.Assets.at("images/favicon.png"))),format.raw/*18.93*/("""">

</head>
<body style="padding-top:65px;background-color:white">

<div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Shop Directory</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class=""""),_display_(Seq[Any](/*36.29*/("active".when(nav == "home")))),format.raw/*36.59*/(""""><a href=""""),_display_(Seq[Any](/*36.71*/routes/*36.77*/.ApplicationController.index())),format.raw/*36.107*/("""">Home</a></li>
                <li class=""""),_display_(Seq[Any](/*37.29*/("active".when(nav == "about")))),format.raw/*37.60*/(""""><a href=""""),_display_(Seq[Any](/*37.72*/routes/*37.78*/.ApplicationController.about())),format.raw/*37.108*/("""">About</a></li>
                <li class=""""),_display_(Seq[Any](/*38.29*/("active".when(nav == "addShop")))),format.raw/*38.62*/(""""><a href=""""),_display_(Seq[Any](/*38.74*/routes/*38.80*/.ShopController.blank())),format.raw/*38.103*/("""">Add Shop</a></li>
                <li class=""""),_display_(Seq[Any](/*39.29*/("active".when(nav == "contact")))),format.raw/*39.62*/(""""><a href="#contact">Contact</a></li>


            </ul>
            """),_display_(Seq[Any](/*43.14*/if(session.get("email")==null)/*43.44*/{_display_(Seq[Any](format.raw/*43.45*/("""
            <ul class="nav navbar-nav navbar-right">

                <li><a href=""""),_display_(Seq[Any](/*46.31*/routes/*46.37*/.UserController.login())),format.raw/*46.60*/("""">Log In</a></li>
                <li class=""""),_display_(Seq[Any](/*47.29*/("active".when(nav == "signup")))),format.raw/*47.61*/(""""><a href=""""),_display_(Seq[Any](/*47.73*/routes/*47.79*/.UserController.blank())),format.raw/*47.102*/("""">Sign Up</a></li>
            </ul> """)))}/*48.20*/else/*48.24*/{_display_(Seq[Any](format.raw/*48.25*/("""

            <ul class="nav navbar-nav navbar-right">

                <li class=""""),_display_(Seq[Any](/*52.29*/("active".when(nav == "signup")))),format.raw/*52.61*/(""""><a href=""""),_display_(Seq[Any](/*52.73*/routes/*52.79*/.UserController.authenticate())),format.raw/*52.109*/("""">My Account</a></li>
                <li><a href=""""),_display_(Seq[Any](/*53.31*/routes/*53.37*/.UserController.logout())),format.raw/*53.61*/("""">Logout</a></li>

            </ul>
            """)))})),format.raw/*56.14*/("""
        </div><!--/.nav-collapse -->
    </div>
</div>

<!-- /container -->

<div class="container">

    <div class="content">

        <div class="row">
            <div class="span14">
                """),_display_(Seq[Any](/*69.18*/content)),format.raw/*69.25*/("""
            </div>
        </div>

    </div>
    <!-- /footer -->
</div>
    <div id="footer">
        <div class="container">
            <p class="text-muted credit">Copyright By&copy Akash Singh.</p>
        </div>
    </div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="../../dist/js/bootstrap.min.js"></script>
<script src=""""),_display_(Seq[Any](/*87.15*/routes/*87.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*87.66*/("""" type="text/javascript"></script>

</body>
</html>
"""))}
    }
    
    def render(title:Html,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 19:25:32 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/main.scala.html
                    HASH: d51a9696af8c2bb547083b0b6d105c15eac32a41
                    MATRIX: 783->1|975->47|1005->104|1072->136|1098->141|1193->200|1208->206|1266->242|1355->295|1370->301|1432->341|1630->503|1645->509|1710->552|1806->612|1821->618|1875->650|2663->1402|2715->1432|2763->1444|2778->1450|2831->1480|2912->1525|2965->1556|3013->1568|3028->1574|3081->1604|3163->1650|3218->1683|3266->1695|3281->1701|3327->1724|3412->1773|3467->1806|3578->1881|3617->1911|3656->1912|3780->2000|3795->2006|3840->2029|3923->2076|3977->2108|4025->2120|4040->2126|4086->2149|4144->2188|4157->2192|4196->2193|4320->2281|4374->2313|4422->2325|4437->2331|4490->2361|4579->2414|4594->2420|4640->2444|4725->2497|4980->2716|5009->2723|5608->3286|5623->3292|5690->3337
                    LINES: 26->1|32->1|34->5|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|45->16|45->16|45->16|47->18|47->18|47->18|65->36|65->36|65->36|65->36|65->36|66->37|66->37|66->37|66->37|66->37|67->38|67->38|67->38|67->38|67->38|68->39|68->39|72->43|72->43|72->43|75->46|75->46|75->46|76->47|76->47|76->47|76->47|76->47|77->48|77->48|77->48|81->52|81->52|81->52|81->52|81->52|82->53|82->53|82->53|85->56|98->69|98->69|116->87|116->87|116->87
                    -- GENERATED --
                */
            