
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
                <li class=""""),_display_(Seq[Any](/*38.29*/("active".when(nav == "contact")))),format.raw/*38.62*/(""""><a href="#contact">Contact</a></li>
                 </ul>
                 """),_display_(Seq[Any](/*40.19*/if(session.get("email")==null)/*40.49*/{_display_(Seq[Any](format.raw/*40.50*/("""
                  <ul class="nav navbar-nav">
                 <li class=""""),_display_(Seq[Any](/*42.30*/("active".when(nav == "addShop")))),format.raw/*42.63*/(""""><a href=""""),_display_(Seq[Any](/*42.75*/routes/*42.81*/.ShopController.viewAll())),format.raw/*42.106*/("""">All Shop</a></li>
                 </ul>
                 """)))}/*44.19*/else/*44.23*/{_display_(Seq[Any](format.raw/*44.24*/("""
                  <ul class="nav navbar-nav">
                 <li class=""""),_display_(Seq[Any](/*46.30*/("active".when(nav == "addShop")))),format.raw/*46.63*/(""""><a href=""""),_display_(Seq[Any](/*46.75*/routes/*46.81*/.ShopController.viewAll())),format.raw/*46.106*/("""">All Shop</a></li>
                <li class=""""),_display_(Seq[Any](/*47.29*/("active".when(nav == "addShop")))),format.raw/*47.62*/(""""><a href=""""),_display_(Seq[Any](/*47.74*/routes/*47.80*/.ShopController.blank())),format.raw/*47.103*/("""">Add Shop</a></li>
                </ul>
                """)))})),format.raw/*49.18*/("""
                


           
            """),_display_(Seq[Any](/*54.14*/if(session.get("email")==null)/*54.44*/{_display_(Seq[Any](format.raw/*54.45*/("""
            <ul class="nav navbar-nav navbar-right">

                <li><a href=""""),_display_(Seq[Any](/*57.31*/routes/*57.37*/.UserController.login())),format.raw/*57.60*/("""">Log In</a></li>
                <li class=""""),_display_(Seq[Any](/*58.29*/("active".when(nav == "signup")))),format.raw/*58.61*/(""""><a href=""""),_display_(Seq[Any](/*58.73*/routes/*58.79*/.UserController.blank())),format.raw/*58.102*/("""">Sign Up</a></li>
            </ul> """)))}/*59.20*/else/*59.24*/{_display_(Seq[Any](format.raw/*59.25*/("""

            <ul class="nav navbar-nav navbar-right">

                <li class=""""),_display_(Seq[Any](/*63.29*/("active".when(nav == "signup")))),format.raw/*63.61*/(""""><a href=""""),_display_(Seq[Any](/*63.73*/routes/*63.79*/.UserController.authenticate())),format.raw/*63.109*/("""">My Account</a></li>
                <li><a href=""""),_display_(Seq[Any](/*64.31*/routes/*64.37*/.UserController.logout())),format.raw/*64.61*/("""">Logout</a></li>

            </ul>
            """)))})),format.raw/*67.14*/("""
        </div><!--/.nav-collapse -->
    </div>
</div>

<!-- /container -->

<div class="container">

    <div class="content">

        <div class="row">
            <div class="page-header">
                """),_display_(Seq[Any](/*80.18*/content)),format.raw/*80.25*/("""
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
<script src=""""),_display_(Seq[Any](/*98.15*/routes/*98.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*98.66*/("""" type="text/javascript"></script>

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
                    DATE: Sat Apr 12 22:19:02 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/main.scala.html
                    HASH: c7fb2d6745b2cd80f6defbc2d092c5013b09b8db
                    MATRIX: 783->1|975->47|1005->104|1072->136|1098->141|1193->200|1208->206|1266->242|1355->295|1370->301|1432->341|1630->503|1645->509|1710->552|1806->612|1821->618|1875->650|2663->1402|2715->1432|2763->1444|2778->1450|2831->1480|2912->1525|2965->1556|3013->1568|3028->1574|3081->1604|3163->1650|3218->1683|3335->1764|3374->1794|3413->1795|3527->1873|3582->1906|3630->1918|3645->1924|3693->1949|3775->2012|3788->2016|3827->2017|3941->2095|3996->2128|4044->2140|4059->2146|4107->2171|4192->2220|4247->2253|4295->2265|4310->2271|4356->2294|4449->2355|4535->2405|4574->2435|4613->2436|4737->2524|4752->2530|4797->2553|4880->2600|4934->2632|4982->2644|4997->2650|5043->2673|5101->2712|5114->2716|5153->2717|5277->2805|5331->2837|5379->2849|5394->2855|5447->2885|5536->2938|5551->2944|5597->2968|5682->3021|5942->3245|5971->3252|6570->3815|6585->3821|6652->3866
                    LINES: 26->1|32->1|34->5|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|45->16|45->16|45->16|47->18|47->18|47->18|65->36|65->36|65->36|65->36|65->36|66->37|66->37|66->37|66->37|66->37|67->38|67->38|69->40|69->40|69->40|71->42|71->42|71->42|71->42|71->42|73->44|73->44|73->44|75->46|75->46|75->46|75->46|75->46|76->47|76->47|76->47|76->47|76->47|78->49|83->54|83->54|83->54|86->57|86->57|86->57|87->58|87->58|87->58|87->58|87->58|88->59|88->59|88->59|92->63|92->63|92->63|92->63|92->63|93->64|93->64|93->64|96->67|109->80|109->80|127->98|127->98|127->98
                    -- GENERATED --
                */
            