
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

def /*5.2*/title/*5.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.11*/("""
Add Shop
""")))};
Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*7.2*/("""

"""),_display_(Seq[Any](/*9.2*/main(title,nav="addShop")/*9.27*/ {_display_(Seq[Any](format.raw/*9.29*/("""

"""),_display_(Seq[Any](/*11.2*/if(session.get("email")==null)/*11.32*/{_display_(Seq[Any](format.raw/*11.33*/("""

<div class="alert alert-danger"><p><strong>Warning!</strong>&nbsp;To add a shop please login first.</p>  </div>
""")))}/*14.2*/else/*14.6*/{_display_(Seq[Any](format.raw/*14.7*/("""
<fieldset>
    <legend>Add a new shop</legend>
     <p>To add a shop to this website fill in the form given below.Add as much information about your shop so the customer may know abot your shop more.</p>


"""),_display_(Seq[Any](/*20.2*/form(action = routes.ShopController.submit(),'name ->"userForm", 'id -> "shopCreationForm", 'class -> "form-horizontal", 'role->"form", 'onsubmit -> "return validateForm(this);")/*20.180*/ {_display_(Seq[Any](format.raw/*20.182*/("""

"""),_display_(Seq[Any](/*22.2*/inputText(userForm("name"), '_label -> "Shop Name",'class -> "form-control"))),format.raw/*22.78*/("""
"""),_display_(Seq[Any](/*23.2*/inputText(userForm("addressLine1"), '_label -> "Address Line 1",'class -> "form-control"))),format.raw/*23.91*/("""
"""),_display_(Seq[Any](/*24.2*/inputText(userForm("addressLine2"), '_label -> "Address Line 2",'class -> "form-control"))),format.raw/*24.91*/("""
"""),_display_(Seq[Any](/*25.2*/inputText(userForm("addressLine3"), '_label -> "Address Line 3",'class -> "form-control"))),format.raw/*25.91*/("""
"""),_display_(Seq[Any](/*26.2*/inputText(userForm("city"), '_label -> "City",'class -> "form-control"))),format.raw/*26.73*/("""
"""),_display_(Seq[Any](/*27.2*/inputText(userForm("town"), '_label -> "Town",'class -> "form-control"))),format.raw/*27.73*/("""
"""),_display_(Seq[Any](/*28.2*/inputText(userForm("phoneNumber"), '_label -> "Phone",'class -> "form-control"))),format.raw/*28.81*/("""

      <div >
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
      <br>
    <div>
        <label >Owner Email</label>
        <input type="email" name="owner.email" class="form-control" id="exampleInputEmail1" value=""""),_display_(Seq[Any](/*56.101*/user)),format.raw/*56.105*/("""" placeholder=""""),_display_(Seq[Any](/*56.121*/user)),format.raw/*56.125*/("""" readonly>
    </div>

</fieldset>
    """),format.raw/*73.15*/("""
    <div class="actions">
        <input type="submit" class="btn btn-primary" value="Create">
        <a href=""""),_display_(Seq[Any](/*76.19*/routes/*76.25*/.ApplicationController.index)),format.raw/*76.53*/("""" class="btn">Cancel</a>
    </div>

""")))})),format.raw/*79.2*/("""
<script type="text/javascript" charset="utf-8">
    function validateForm(createShop) """),format.raw/*81.39*/("""{"""),format.raw/*81.40*/("""
    var reason = "";

    reason += validateShopName(createShop.name);
    reason += validateAddress(createShop.addressLine1);
    reason += validateCity(createShop.city);
    reason += validateTown(createShop.town);
    reason += validatePhone(createShop.phoneNumber);
    reason += validateCategory(createShop.category);


    if (reason != "") """),format.raw/*92.23*/("""{"""),format.raw/*92.24*/("""
    alert("Some fields need correction:\n" + reason);
    return false;
    """),format.raw/*95.5*/("""}"""),format.raw/*95.6*/("""

    return true;
    """),format.raw/*98.5*/("""}"""),format.raw/*98.6*/("""


    function validateShopName(fld) """),format.raw/*101.36*/("""{"""),format.raw/*101.37*/("""
    var error = "";
    var illegalChars = /\W/; // allow letters, numbers, and underscores
    var letters = /^[A-Za-z]+$/;

    if (fld.value == "") """),format.raw/*106.26*/("""{"""),format.raw/*106.27*/("""

    error = "You didn't enter a Shop Name.\n";

    """),format.raw/*110.5*/("""}"""),format.raw/*110.6*/("""  
    return error;
    """),format.raw/*112.5*/("""}"""),format.raw/*112.6*/("""


    function validateAddress(fld) """),format.raw/*115.35*/("""{"""),format.raw/*115.36*/("""
    var error = "";
    var illegalChars = /\W/; // allow letters, numbers, and underscores
    var letters = /^[A-Za-z]+$/;

    if (fld.value == "") """),format.raw/*120.26*/("""{"""),format.raw/*120.27*/("""

    error = "You didn't enter a AddressLine 1.\n";

    """),format.raw/*124.5*/("""}"""),format.raw/*124.6*/(""" 
    return error;
    """),format.raw/*126.5*/("""}"""),format.raw/*126.6*/("""

    function validateCity(fld) """),format.raw/*128.32*/("""{"""),format.raw/*128.33*/("""
    var error = "";
    var illegalChars = /\W/; // allow letters, numbers, and underscores

    if (fld.value == "") """),format.raw/*132.26*/("""{"""),format.raw/*132.27*/("""

    error = "You didn't enter a City.\n";

    """),format.raw/*136.5*/("""}"""),format.raw/*136.6*/("""  else if (illegalChars.test(fld.value)) """),format.raw/*136.47*/("""{"""),format.raw/*136.48*/("""
    error = "The City field contains illegal characters.\n";

    """),format.raw/*139.5*/("""}"""),format.raw/*139.6*/("""
    return error;
    """),format.raw/*141.5*/("""}"""),format.raw/*141.6*/("""

    function validateTown(fld) """),format.raw/*143.32*/("""{"""),format.raw/*143.33*/("""
    var error = "";
    var illegalChars = /\W/; // allow letters, numbers, and underscores

    if (fld.value == "") """),format.raw/*147.26*/("""{"""),format.raw/*147.27*/("""

    error = "You didn't enter a Town.\n";

    """),format.raw/*151.5*/("""}"""),format.raw/*151.6*/("""  else if (illegalChars.test(fld.value)) """),format.raw/*151.47*/("""{"""),format.raw/*151.48*/("""
    error = "The Town field contains illegal characters.\n";

    """),format.raw/*154.5*/("""}"""),format.raw/*154.6*/("""
    return error;
    """),format.raw/*156.5*/("""}"""),format.raw/*156.6*/("""

    function validatePhone(fld) """),format.raw/*158.33*/("""{"""),format.raw/*158.34*/("""
    var error = "";
    var stripped = fld.value.replace(/[\(\)\.\-\ ]/g, '');

    if (fld.value == "") """),format.raw/*162.26*/("""{"""),format.raw/*162.27*/("""
    error = "You didn't enter a phone number.\n";

    """),format.raw/*165.5*/("""}"""),format.raw/*165.6*/(""" else if (isNaN(parseInt(stripped))) """),format.raw/*165.43*/("""{"""),format.raw/*165.44*/("""
    error = "The phone number contains illegal characters.\n";

    """),format.raw/*168.5*/("""}"""),format.raw/*168.6*/(""" else if (!(stripped.length == 10)) """),format.raw/*168.42*/("""{"""),format.raw/*168.43*/("""
    error = "The phone number is the wrong length. Make sure you included an area code.\n";

    """),format.raw/*171.5*/("""}"""),format.raw/*171.6*/("""
    return error;
    """),format.raw/*173.5*/("""}"""),format.raw/*173.6*/("""

    function validateCategory(fld) """),format.raw/*175.36*/("""{"""),format.raw/*175.37*/("""
    var error = "";
    var illegalChars = /\W/; // allow letters, numbers, and underscores

    if (fld.value == "") """),format.raw/*179.26*/("""{"""),format.raw/*179.27*/("""

    error = "You didn't select a Category.\n";

    """),format.raw/*183.5*/("""}"""),format.raw/*183.6*/("""  
    return error;
    """),format.raw/*185.5*/("""}"""),format.raw/*185.6*/("""







</script>
        """)))})),format.raw/*194.10*/("""
        """)))})))}
    }
    
    def render(userForm:Form[models.Shop],user:String): play.api.templates.HtmlFormat.Appendable = apply(userForm,user)
    
    def f:((Form[models.Shop],String) => play.api.templates.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 08 19:18:31 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/shop/create.scala.html
                    HASH: c0f22775369d0a5b6f6bb660bea4edc97a4098f2
                    MATRIX: 798->1|970->102|982->107|1066->111|1118->44|1148->124|1187->129|1220->154|1259->156|1299->161|1338->191|1377->192|1513->310|1525->314|1563->315|1812->529|2000->707|2041->709|2081->714|2179->790|2217->793|2328->882|2366->885|2477->974|2515->977|2626->1066|2664->1069|2757->1140|2795->1143|2888->1214|2926->1217|3027->1296|4296->2528|4323->2532|4376->2548|4403->2552|4475->3146|4628->3263|4643->3269|4693->3297|4765->3338|4882->3427|4911->3428|5298->3787|5327->3788|5434->3868|5462->3869|5515->3895|5543->3896|5613->3937|5643->3938|5829->4095|5859->4096|5945->4154|5974->4155|6029->4182|6058->4183|6127->4223|6157->4224|6343->4381|6373->4382|6463->4444|6492->4445|6546->4471|6575->4472|6639->4507|6669->4508|6821->4631|6851->4632|6932->4685|6961->4686|7031->4727|7061->4728|7159->4798|7188->4799|7241->4824|7270->4825|7334->4860|7364->4861|7516->4984|7546->4985|7627->5038|7656->5039|7726->5080|7756->5081|7854->5151|7883->5152|7936->5177|7965->5178|8030->5214|8060->5215|8199->5325|8229->5326|8316->5385|8345->5386|8411->5423|8441->5424|8541->5496|8570->5497|8635->5533|8665->5534|8794->5635|8823->5636|8876->5661|8905->5662|8973->5701|9003->5702|9155->5825|9185->5826|9271->5884|9300->5885|9355->5912|9384->5913|9453->5949
                    LINES: 26->1|31->5|31->5|33->5|36->1|38->7|40->9|40->9|40->9|42->11|42->11|42->11|45->14|45->14|45->14|51->20|51->20|51->20|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|57->26|57->26|58->27|58->27|59->28|59->28|87->56|87->56|87->56|87->56|91->73|94->76|94->76|94->76|97->79|99->81|99->81|110->92|110->92|113->95|113->95|116->98|116->98|119->101|119->101|124->106|124->106|128->110|128->110|130->112|130->112|133->115|133->115|138->120|138->120|142->124|142->124|144->126|144->126|146->128|146->128|150->132|150->132|154->136|154->136|154->136|154->136|157->139|157->139|159->141|159->141|161->143|161->143|165->147|165->147|169->151|169->151|169->151|169->151|172->154|172->154|174->156|174->156|176->158|176->158|180->162|180->162|183->165|183->165|183->165|183->165|186->168|186->168|186->168|186->168|189->171|189->171|191->173|191->173|193->175|193->175|197->179|197->179|201->183|201->183|203->185|203->185|212->194
                    -- GENERATED --
                */
            