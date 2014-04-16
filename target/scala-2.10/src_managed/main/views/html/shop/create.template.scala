
package views.html.shop

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
object create extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[models.Shop],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[models.Shop], user: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*5.1*/("""

"""),_display_(Seq[Any](/*7.2*/main(Html("Create Shop"))/*7.27*/ {_display_(Seq[Any](format.raw/*7.29*/("""

"""),format.raw/*12.9*/("""

 """),_display_(Seq[Any](/*14.3*/if(flash.size() > 0)/*14.23*/{_display_(Seq[Any](format.raw/*14.24*/("""
      <div class="alert-alert error">
          """),_display_(Seq[Any](/*16.12*/for((key, value) <- flash) yield /*16.38*/{_display_(Seq[Any](format.raw/*16.39*/("""
              <strong>Error : </strong> """),_display_(Seq[Any](/*17.42*/value)),format.raw/*17.47*/("""<br />
          """)))})),format.raw/*18.12*/("""
      </div> 
  """)))})),format.raw/*20.4*/("""




<fieldset>
    <legend>Add a new shop</legend>
     <p>To add a shop to this website fill in the form given below.Add as much information about your shop so the customer may know abot your shop more.</p>


"""),_display_(Seq[Any](/*30.2*/form(action = routes.ShopController.submit(), 'id -> "shopCreationForm", 'class -> "form-horizontal", 'role->"form")/*30.118*/ {_display_(Seq[Any](format.raw/*30.120*/("""
"""),format.raw/*60.3*/("""

<div class="form-group">
"""),_display_(Seq[Any](/*63.2*/inputText(userForm("name"), '_label -> "Shop Name",'class -> "form-control"))),format.raw/*63.78*/("""</div>
<div class="form-group">
"""),_display_(Seq[Any](/*65.2*/inputText(userForm("addressLine1"), '_label -> "Address Line 1",'class -> "form-control"))),format.raw/*65.91*/("""</div>
<div class="form-group">
"""),_display_(Seq[Any](/*67.2*/inputText(userForm("addressLine2"), '_label -> "Address Line 2",'class -> "form-control"))),format.raw/*67.91*/("""</div>
<div class="form-group">
"""),_display_(Seq[Any](/*69.2*/inputText(userForm("addressLine3"), '_label -> "Address Line 3",'class -> "form-control"))),format.raw/*69.91*/("""</div>
<div class="form-group">
"""),_display_(Seq[Any](/*71.2*/inputText(userForm("city"), '_label -> "City",'class -> "form-control"))),format.raw/*71.73*/("""</div>
<div class="form-group">
"""),_display_(Seq[Any](/*73.2*/inputText(userForm("town"), '_label -> "Town",'class -> "form-control"))),format.raw/*73.73*/("""</div>
<div class="form-group">
"""),_display_(Seq[Any](/*75.2*/inputText(userForm("phoneNumber"), '_label -> "Phone",'class -> "form-control"))),format.raw/*75.81*/("""</div>

<div class="form-group">
    <label for="exampleInputEmail1">Owner Email</label>
    <input type="email" name="owner.email" class="form-control" id="exampleInputEmail1" value=""""),_display_(Seq[Any](/*79.97*/user)),format.raw/*79.101*/("""" placeholder=""""),_display_(Seq[Any](/*79.117*/user)),format.raw/*79.121*/("""" readonly>
  </div>




"""),format.raw/*101.3*/("""

    <div class="form-group">
        <input type="submit" class="btn btn-primary" value="Create">
        <a href=""""),_display_(Seq[Any](/*105.19*/routes/*105.25*/.ApplicationController.index)),format.raw/*105.53*/("""" class="btn">Cancel</a>
    </div>


</fieldset>
        """)))})),format.raw/*110.10*/("""
        """)))})))}
    }
    
    def render(userForm:Form[models.Shop],user:String): play.api.templates.HtmlFormat.Appendable = apply(userForm,user)
    
    def f:((Form[models.Shop],String) => play.api.templates.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 15 21:30:28 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/shop/create.scala.html
                    HASH: efc494e07a9dfbd6125dee6a4a309e9aa069ff76
                    MATRIX: 798->1|987->44|1017->101|1056->106|1089->131|1128->133|1159->296|1200->302|1229->322|1268->323|1356->375|1398->401|1437->402|1516->445|1543->450|1594->469|1645->489|1902->711|2028->827|2069->829|2098->1844|2164->1875|2262->1951|2332->1986|2443->2075|2513->2110|2624->2199|2694->2234|2805->2323|2875->2358|2968->2429|3038->2464|3131->2535|3201->2570|3302->2649|3527->2838|3554->2842|3607->2858|3634->2862|3693->3399|3852->3521|3868->3527|3919->3555|4016->3619
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|38->12|40->14|40->14|40->14|42->16|42->16|42->16|43->17|43->17|44->18|46->20|56->30|56->30|56->30|57->60|60->63|60->63|62->65|62->65|64->67|64->67|66->69|66->69|68->71|68->71|70->73|70->73|72->75|72->75|76->79|76->79|76->79|76->79|82->101|86->105|86->105|86->105|91->110
                    -- GENERATED --
                */
            