
package views.html.user

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
object account extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.Member,List[Shop],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: models.Member,user_shops:List[Shop]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*5.2*/title/*5.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.11*/("""
Account
""")))};
Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*7.2*/("""

"""),_display_(Seq[Any](/*9.2*/main(title,nav="account")/*9.27*/ {_display_(Seq[Any](format.raw/*9.29*/("""
<fieldset>



<legend><h2>"""),_display_(Seq[Any](/*14.14*/user/*14.18*/.firstName)),format.raw/*14.28*/("""&nbsp;"""),_display_(Seq[Any](/*14.35*/user/*14.39*/.lastName)),format.raw/*14.48*/("""


    <a  class="btn pull-right" href=""""),_display_(Seq[Any](/*17.39*/routes/*17.45*/.UserController.edit(user.id))),format.raw/*17.74*/("""">Edit</a>

</h2>

</legend>

    <div class="container">
        <div class="row">

            <div class="col-sm-10 pull-left">

                <div class="form-group row">
                    <label class="col-sm-2 control-label">First Name</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">"""),_display_(Seq[Any](/*31.57*/user/*31.61*/.firstName)),format.raw/*31.71*/("""</p>
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-sm-2 control-label">Last Name</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">"""),_display_(Seq[Any](/*38.57*/user/*38.61*/.lastName)),format.raw/*38.70*/("""</p>
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-sm-2 control-label">Email</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">"""),_display_(Seq[Any](/*45.57*/user/*45.61*/.email)),format.raw/*45.67*/("""</p>
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-sm-2 control-label">Password</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">"""),_display_(Seq[Any](/*52.57*/user/*52.61*/.password)),format.raw/*52.70*/("""</p>
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-sm-2 control-label">Shops</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">"""),_display_(Seq[Any](/*59.57*/user_shops/*59.67*/.size)),format.raw/*59.72*/(""" Shop(s) added
                            """),_display_(Seq[Any](/*60.30*/for(shops<-user_shops) yield /*60.52*/   {_display_(Seq[Any](format.raw/*60.56*/("""
                         ( <a href=""""),_display_(Seq[Any](/*61.38*/routes/*61.44*/.ShopController.profile(shops.owner.id))),format.raw/*61.83*/("""">  """),_display_(Seq[Any](/*61.88*/shops/*61.93*/.name)),format.raw/*61.98*/("""&nbsp;  </a> )
                            """)))})),format.raw/*62.30*/("""


                            </p>
                    </div>
                </div>

            </div>

            <div class="col-sm-2 pull-right">

                <div class="form-group row">
                    <img   src=""""),_display_(Seq[Any](/*74.34*/routes/*74.40*/.Assets.at("images/person-icon.jpg"))),format.raw/*74.76*/("""" height="200" width="150"  class="img-thumbnail">
                </div>
            </div>
        </div>
    </div>

   </fieldset>
""")))})))}
    }
    
    def render(user:models.Member,user_shops:List[Shop]): play.api.templates.HtmlFormat.Appendable = apply(user,user_shops)
    
    def f:((models.Member,List[Shop]) => play.api.templates.HtmlFormat.Appendable) = (user,user_shops) => apply(user,user_shops)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 29 05:00:46 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/user/account.scala.html
                    HASH: 7356a36d902d9a51882f8d65ef3bdaa767d7fc54
                    MATRIX: 799->1|969->98|981->103|1065->107|1114->44|1142->117|1179->120|1212->145|1251->147|1315->175|1328->179|1360->189|1403->196|1416->200|1447->209|1524->250|1539->256|1590->285|1980->639|1993->643|2025->653|2338->930|2351->934|2382->943|2691->1216|2704->1220|2732->1226|3044->1502|3057->1506|3088->1515|3397->1788|3416->1798|3443->1803|3523->1847|3561->1869|3603->1873|3677->1911|3692->1917|3753->1956|3794->1961|3808->1966|3835->1971|3911->2015|4179->2247|4194->2253|4252->2289
                    LINES: 26->1|31->5|31->5|33->5|36->1|38->7|40->9|40->9|40->9|45->14|45->14|45->14|45->14|45->14|45->14|48->17|48->17|48->17|62->31|62->31|62->31|69->38|69->38|69->38|76->45|76->45|76->45|83->52|83->52|83->52|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|93->62|105->74|105->74|105->74
                    -- GENERATED --
                */
            