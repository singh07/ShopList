
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
<body style="padding-top:35px;background-color:white">

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
            """),format.raw/*38.103*/("""
                  <li class=""""),_display_(Seq[Any](/*39.31*/("active".when(nav == "category")))),format.raw/*39.65*/(""""><a href=""""),_display_(Seq[Any](/*39.77*/routes/*39.83*/.ShopController.displayCategory())),format.raw/*39.116*/("""">Category</a></li>
                 </ul>
                 """),_display_(Seq[Any](/*41.19*/if(session.get("email")==null)/*41.49*/{_display_(Seq[Any](format.raw/*41.50*/("""
                  <ul class="nav navbar-nav">
                 <li class=""""),_display_(Seq[Any](/*43.30*/("active".when(nav == "allShop")))),format.raw/*43.63*/(""""><a href=""""),_display_(Seq[Any](/*43.75*/routes/*43.81*/.ShopController.viewAll())),format.raw/*43.106*/("""">All Shop</a></li>
                 </ul>
                 """)))}/*45.19*/else/*45.23*/{_display_(Seq[Any](format.raw/*45.24*/("""
                  <ul class="nav navbar-nav">
                 <li class=""""),_display_(Seq[Any](/*47.30*/("active".when(nav == "allShop")))),format.raw/*47.63*/(""""><a href=""""),_display_(Seq[Any](/*47.75*/routes/*47.81*/.ShopController.viewAll())),format.raw/*47.106*/("""">All Shop</a></li>
                <li class=""""),_display_(Seq[Any](/*48.29*/("active".when(nav == "addShop")))),format.raw/*48.62*/(""""><a href=""""),_display_(Seq[Any](/*48.74*/routes/*48.80*/.ShopController.blank())),format.raw/*48.103*/("""">Add Shop</a></li>
                </ul>
                """)))})),format.raw/*50.18*/("""
                


           
            """),_display_(Seq[Any](/*55.14*/if(session.get("email")==null)/*55.44*/{_display_(Seq[Any](format.raw/*55.45*/("""
            <ul class="nav navbar-nav navbar-right">

                <li class=""""),_display_(Seq[Any](/*58.29*/("active".when(nav == "logIn")))),format.raw/*58.60*/(""""><a href=""""),_display_(Seq[Any](/*58.72*/routes/*58.78*/.UserController.login())),format.raw/*58.101*/("""">Sign In</a></li>
                <li class=""""),_display_(Seq[Any](/*59.29*/("active".when(nav == "signUp")))),format.raw/*59.61*/(""""><a href=""""),_display_(Seq[Any](/*59.73*/routes/*59.79*/.UserController.blank())),format.raw/*59.102*/("""">Sign Up</a></li>
            </ul> """)))}/*60.20*/else/*60.24*/{_display_(Seq[Any](format.raw/*60.25*/("""

            <ul class="nav navbar-nav navbar-right">

                <li class=""""),_display_(Seq[Any](/*64.29*/("active".when(nav == "account")))),format.raw/*64.62*/(""""><a href=""""),_display_(Seq[Any](/*64.74*/routes/*64.80*/.UserController.account())),format.raw/*64.105*/("""">My Account</a></li>
                <li><a href=""""),_display_(Seq[Any](/*65.31*/routes/*65.37*/.UserController.logout())),format.raw/*65.61*/("""">Logout</a></li>

            </ul>
            """)))})),format.raw/*68.14*/("""
        </div><!--/.nav-collapse -->
    </div>
</div>

<!-- /container -->

<div class="container">

    <div class="content">

        <div class="row">
            <div class="page-header">
                """),_display_(Seq[Any](/*81.18*/content)),format.raw/*81.25*/("""
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
<script src=""""),_display_(Seq[Any](/*99.15*/routes/*99.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*99.66*/("""" type="text/javascript"></script>

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
                    DATE: Sun Apr 27 23:09:18 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/main.scala.html
                    HASH: 10c501384da2cc4ef8023bb21d01bf19442d1693
                    MATRIX: 783->1|975->47|1005->104|1072->136|1098->141|1193->200|1208->206|1266->242|1355->295|1370->301|1432->341|1630->503|1645->509|1710->552|1806->612|1821->618|1875->650|2663->1402|2715->1432|2763->1444|2778->1450|2831->1480|2912->1525|2965->1556|3013->1568|3028->1574|3081->1604|3140->1724|3208->1756|3264->1790|3312->1802|3327->1808|3383->1841|3482->1904|3521->1934|3560->1935|3674->2013|3729->2046|3777->2058|3792->2064|3840->2089|3922->2152|3935->2156|3974->2157|4088->2235|4143->2268|4191->2280|4206->2286|4254->2311|4339->2360|4394->2393|4442->2405|4457->2411|4503->2434|4596->2495|4682->2545|4721->2575|4760->2576|4882->2662|4935->2693|4983->2705|4998->2711|5044->2734|5128->2782|5182->2814|5230->2826|5245->2832|5291->2855|5349->2894|5362->2898|5401->2899|5525->2987|5580->3020|5628->3032|5643->3038|5691->3063|5780->3116|5795->3122|5841->3146|5926->3199|6186->3423|6215->3430|6814->3993|6829->3999|6896->4044
                    LINES: 26->1|32->1|34->5|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|45->16|45->16|45->16|47->18|47->18|47->18|65->36|65->36|65->36|65->36|65->36|66->37|66->37|66->37|66->37|66->37|67->38|68->39|68->39|68->39|68->39|68->39|70->41|70->41|70->41|72->43|72->43|72->43|72->43|72->43|74->45|74->45|74->45|76->47|76->47|76->47|76->47|76->47|77->48|77->48|77->48|77->48|77->48|79->50|84->55|84->55|84->55|87->58|87->58|87->58|87->58|87->58|88->59|88->59|88->59|88->59|88->59|89->60|89->60|89->60|93->64|93->64|93->64|93->64|93->64|94->65|94->65|94->65|97->68|110->81|110->81|128->99|128->99|128->99
                    -- GENERATED --
                */
            