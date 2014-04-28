
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
            <a class="navbar-brand" href=""""),_display_(Seq[Any](/*32.44*/routes/*32.50*/.ApplicationController.index())),format.raw/*32.80*/("""">Shop Directory</a>
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
                    DATE: Tue Apr 29 01:51:03 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/main.scala.html
                    HASH: 03d1260ef6e353581b4d1667f72b28627338f04b
                    MATRIX: 783->1|975->47|1005->104|1072->136|1098->141|1193->200|1208->206|1266->242|1355->295|1370->301|1432->341|1630->503|1645->509|1710->552|1806->612|1821->618|1875->650|2508->1247|2523->1253|2575->1283|2766->1438|2818->1468|2866->1480|2881->1486|2934->1516|3015->1561|3068->1592|3116->1604|3131->1610|3184->1640|3243->1760|3311->1792|3367->1826|3415->1838|3430->1844|3486->1877|3585->1940|3624->1970|3663->1971|3777->2049|3832->2082|3880->2094|3895->2100|3943->2125|4025->2188|4038->2192|4077->2193|4191->2271|4246->2304|4294->2316|4309->2322|4357->2347|4442->2396|4497->2429|4545->2441|4560->2447|4606->2470|4699->2531|4785->2581|4824->2611|4863->2612|4985->2698|5038->2729|5086->2741|5101->2747|5147->2770|5231->2818|5285->2850|5333->2862|5348->2868|5394->2891|5452->2930|5465->2934|5504->2935|5628->3023|5683->3056|5731->3068|5746->3074|5794->3099|5883->3152|5898->3158|5944->3182|6029->3235|6289->3459|6318->3466|6917->4029|6932->4035|6999->4080
                    LINES: 26->1|32->1|34->5|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|45->16|45->16|45->16|47->18|47->18|47->18|61->32|61->32|61->32|65->36|65->36|65->36|65->36|65->36|66->37|66->37|66->37|66->37|66->37|67->38|68->39|68->39|68->39|68->39|68->39|70->41|70->41|70->41|72->43|72->43|72->43|72->43|72->43|74->45|74->45|74->45|76->47|76->47|76->47|76->47|76->47|77->48|77->48|77->48|77->48|77->48|79->50|84->55|84->55|84->55|87->58|87->58|87->58|87->58|87->58|88->59|88->59|88->59|88->59|88->59|89->60|89->60|89->60|93->64|93->64|93->64|93->64|93->64|94->65|94->65|94->65|97->68|110->81|110->81|128->99|128->99|128->99
                    -- GENERATED --
                */
            