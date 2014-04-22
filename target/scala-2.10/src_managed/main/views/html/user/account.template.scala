
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

    <a  class="btn pull-right" href="#">Delete</a>
    <a  class="btn pull-right" href="#">Edit</a>

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
                            ("""),_display_(Seq[Any](/*61.31*/shops/*61.36*/.name)),format.raw/*61.41*/("""&nbsp;)
                            """)))})),format.raw/*62.30*/("""


                            </p>
                    </div>
                </div>

            </div>

            <div class="col-sm-2 pull-right">

                <div class="form-group row">
                    <img  src=""""),_display_(Seq[Any](/*74.33*/routes/*74.39*/.Assets.at("images/person-icon.jpg"))),format.raw/*74.75*/("""" height="200" width="150"  class="img-thumbnail">
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
                    DATE: Tue Apr 22 22:51:14 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/user/account.scala.html
                    HASH: 323b78ca426b043af599ba256d8ccc2917fa68e5
                    MATRIX: 799->1|969->98|981->103|1065->107|1114->44|1142->117|1179->120|1212->145|1251->147|1315->175|1328->179|1360->189|1403->196|1416->200|1447->209|1928->654|1941->658|1973->668|2286->945|2299->949|2330->958|2639->1231|2652->1235|2680->1241|2992->1517|3005->1521|3036->1530|3345->1803|3364->1813|3391->1818|3471->1862|3509->1884|3551->1888|3618->1919|3632->1924|3659->1929|3728->1966|3995->2197|4010->2203|4068->2239
                    LINES: 26->1|31->5|31->5|33->5|36->1|38->7|40->9|40->9|40->9|45->14|45->14|45->14|45->14|45->14|45->14|62->31|62->31|62->31|69->38|69->38|69->38|76->45|76->45|76->45|83->52|83->52|83->52|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|105->74|105->74|105->74
                    -- GENERATED --
                */
            