
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

def /*6.2*/title/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
Add Shop
""")))};
Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(title,nav="addShop")/*10.27*/ {_display_(Seq[Any](format.raw/*10.29*/("""


"""),format.raw/*16.9*/("""

 """),_display_(Seq[Any](/*18.3*/if(flash.size() > 0)/*18.23*/{_display_(Seq[Any](format.raw/*18.24*/("""
      <div class="alert-alert error">
          """),_display_(Seq[Any](/*20.12*/for((key, value) <- flash) yield /*20.38*/{_display_(Seq[Any](format.raw/*20.39*/("""
              <strong>Error : </strong> """),_display_(Seq[Any](/*21.42*/value)),format.raw/*21.47*/("""<br />
          """)))})),format.raw/*22.12*/("""
      </div> 
  """)))})),format.raw/*24.4*/("""




<fieldset>
    <legend>Add a new shop</legend>
     <p>To add a shop to this website fill in the form given below.Add as much information about your shop so the customer may know abot your shop more.</p>


"""),_display_(Seq[Any](/*34.2*/form(action = routes.ShopController.submit(), 'id -> "shopCreationForm", 'class -> "form-horizontal", 'role->"form")/*34.118*/ {_display_(Seq[Any](format.raw/*34.120*/("""
"""),format.raw/*64.3*/("""

<div class="form-group">
"""),_display_(Seq[Any](/*67.2*/inputText(userForm("name"), '_label -> "Shop Name",'class -> "form-control"))),format.raw/*67.78*/("""</div>
<div class="form-group">
"""),_display_(Seq[Any](/*69.2*/inputText(userForm("addressLine1"), '_label -> "Address Line 1",'class -> "form-control"))),format.raw/*69.91*/("""</div>
<div class="form-group">
"""),_display_(Seq[Any](/*71.2*/inputText(userForm("addressLine2"), '_label -> "Address Line 2",'class -> "form-control"))),format.raw/*71.91*/("""</div>
<div class="form-group">
"""),_display_(Seq[Any](/*73.2*/inputText(userForm("addressLine3"), '_label -> "Address Line 3",'class -> "form-control"))),format.raw/*73.91*/("""</div>
<div class="form-group">
"""),_display_(Seq[Any](/*75.2*/inputText(userForm("city"), '_label -> "City",'class -> "form-control"))),format.raw/*75.73*/("""</div>
<div class="form-group">
"""),_display_(Seq[Any](/*77.2*/inputText(userForm("town"), '_label -> "Town",'class -> "form-control"))),format.raw/*77.73*/("""</div>
<div class="form-group">
"""),_display_(Seq[Any](/*79.2*/inputText(userForm("phoneNumber"), '_label -> "Phone",'class -> "form-control"))),format.raw/*79.81*/("""</div>

  <div class="form-group">
        <label>Category</label>
        <select name="category" class="form-control" id="select1" >
            <option value="">-:Select Category:-&nbsp;</option>
            <option value="antique shop">antique shop</option>
            <option value="barbershop">barbershop</option>
            <option value="beauty parlour">beauty parlour</option>
            <option value="beauty salon">beauty salon</option>
            <option value="big-box store">big-box store</option>
            <option value="bookshop">bookshop</option>
            <option value="bottle shop">bottle shop</option>
            <option value="chemist">chemist</option>
            <option value="dairy">dairy</option>
            <option value="garage">garage</option>
            <option value="general store">general store</option>
            <option value="hardware shop">hardware shop</option>
            <option value="supermarket">supermarket</option>
            <option value="sweet shop">sweet shop</option>



        </select>
    </div>
   


<div class="form-group">
    <label for="exampleInputEmail1">Owner Email</label>
    <input type="email" name="owner.email" class="form-control" id="exampleInputEmail1" value=""""),_display_(Seq[Any](/*109.97*/user)),format.raw/*109.101*/("""" placeholder=""""),_display_(Seq[Any](/*109.117*/user)),format.raw/*109.121*/("""" readonly>
  </div>




"""),format.raw/*131.3*/("""

    <div class="form-group">
        <input type="submit" class="btn btn-primary" value="Create">
        <a href=""""),_display_(Seq[Any](/*135.19*/routes/*135.25*/.ApplicationController.index)),format.raw/*135.53*/("""" class="btn">Cancel</a>
    </div>


</fieldset>
        """)))})),format.raw/*140.10*/("""
        """)))})))}
    }
    
    def render(userForm:Form[models.Shop],user:String): play.api.templates.HtmlFormat.Appendable = apply(userForm,user)
    
    def f:((Form[models.Shop],String) => play.api.templates.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 22 23:50:44 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/shop/create.scala.html
                    HASH: dc09e7c48f3cf71f6b9d12490b9578755d17035a
                    MATRIX: 798->1|970->104|982->109|1066->113|1118->44|1148->101|1176->126|1216->131|1250->156|1290->158|1323->323|1364->329|1393->349|1432->350|1520->402|1562->428|1601->429|1680->472|1707->477|1758->496|1809->516|2066->738|2192->854|2233->856|2262->1871|2328->1902|2426->1978|2496->2013|2607->2102|2677->2137|2788->2226|2858->2261|2969->2350|3039->2385|3132->2456|3202->2491|3295->2562|3365->2597|3466->2676|4783->3956|4811->3960|4865->3976|4893->3980|4952->4517|5111->4639|5127->4645|5178->4673|5275->4737
                    LINES: 26->1|31->6|31->6|33->6|36->1|38->5|39->8|41->10|41->10|41->10|44->16|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|50->22|52->24|62->34|62->34|62->34|63->64|66->67|66->67|68->69|68->69|70->71|70->71|72->73|72->73|74->75|74->75|76->77|76->77|78->79|78->79|108->109|108->109|108->109|108->109|114->131|118->135|118->135|118->135|123->140
                    -- GENERATED --
                */
            