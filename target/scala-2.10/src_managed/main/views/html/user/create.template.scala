
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
object create extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.Member],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signupForm: Form[models.Member]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*5.2*/title/*5.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.11*/("""
Sign Up
""")))};
Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*7.2*/("""

"""),_display_(Seq[Any](/*9.2*/main(title,nav="signUp")/*9.26*/ {_display_(Seq[Any](format.raw/*9.28*/("""

    """),_display_(Seq[Any](/*11.6*/form(action = routes.UserController.submit(),'name ->"signupForm", 'class -> "form-horizontal", 'onsubmit -> "return validate(this);")/*11.140*/ {_display_(Seq[Any](format.raw/*11.142*/("""
        <fieldset>
           <legend><h1> Account Information</h1></legend>

<div class="form-group">
            """),_display_(Seq[Any](/*16.14*/inputText(signupForm("firstName"),
            '_label -> "First name:",
            'class -> "form-control",
            '_help -> "Please enter your first name."))),format.raw/*19.55*/("""
            </div>

<div class="form-group">
            """),_display_(Seq[Any](/*23.14*/inputText(signupForm("lastName"),
            '_label -> "Last name:",
            'class -> "form-control",
            '_help -> "Please enter your last name."))),format.raw/*26.54*/("""
            </div>

<div class="form-group">
            """),_display_(Seq[Any](/*30.14*/inputText(signupForm("email"),
                        '_label -> "Email Address:",
                        'class -> "form-control",
                        '_help -> "Enter a valid email address.",
                        '_error -> signupForm.globalError))),format.raw/*34.59*/("""
                        </div>

<div class="form-group">
            """),_display_(Seq[Any](/*38.14*/inputPassword(signupForm("password"),
                            '_label -> "Password:",
                            'class -> "form-control",
                            '_help -> "A password must be at least 6 characters."))),format.raw/*41.83*/("""
                            </div>
        </fieldset>

        <div class="form-group">
            <input type="submit" class="btn btn-primary" value="Sign Up">
            <a href=""""),_display_(Seq[Any](/*47.23*/routes/*47.29*/.ApplicationController.index)),format.raw/*47.57*/("""" class="btn">Cancel</a>
        </div>
        
         <script type="text/javascript" charset="utf-8">
        function validate(signup) """),format.raw/*51.35*/("""{"""),format.raw/*51.36*/("""
        var reason = "";

        reason += validateFirstname(signup.firstName);
        reason += validateLastname(signup.lastName);
        reason += validatePassword(signup.password);
        reason += validateEmail(signup.email);

        if (reason != "") """),format.raw/*59.27*/("""{"""),format.raw/*59.28*/("""
        alert("Some fields need correction:\n" + reason);
        return false;
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/("""

        return true;
        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/("""


        function validateFirstname(fld) """),format.raw/*68.41*/("""{"""),format.raw/*68.42*/("""
        var error = "";
        var illegalChars = /\W/; // allow letters, numbers, and underscores
        var letters = /^[A-Za-z]+$/;

        if (fld.value == "") """),format.raw/*73.30*/("""{"""),format.raw/*73.31*/("""

        error = "You didn't enter a firstname.\n";

        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/("""  else if (illegalChars.test(fld.value)) """),format.raw/*77.51*/("""{"""),format.raw/*77.52*/("""

        error = "The firstname contains illegal characters.\n";
        """),format.raw/*80.9*/("""}"""),format.raw/*80.10*/(""" else if(!(fld.value.match(letters)))

        """),format.raw/*82.9*/("""{"""),format.raw/*82.10*/("""
        error = "The firstname can only contain alphabets.\n";
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/("""
        return error;
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/("""


        function validateLastname(fld) """),format.raw/*89.40*/("""{"""),format.raw/*89.41*/("""
        var error = "";
        var illegalChars = /\W/; // allow letters, numbers, and underscores
        var letters = /^[A-Za-z]+$/;

        if (fld.value == "") """),format.raw/*94.30*/("""{"""),format.raw/*94.31*/("""

        error = "You didn't enter a lastname.\n";

        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/("""  else if (illegalChars.test(fld.value)) """),format.raw/*98.51*/("""{"""),format.raw/*98.52*/("""

        error = "The lastname contains illegal characters.\n";
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/(""" else if(!(fld.value.match(letters)))

        """),format.raw/*103.9*/("""{"""),format.raw/*103.10*/("""
        error = "The lastname can only contain alphabets.\n";
        """),format.raw/*105.9*/("""}"""),format.raw/*105.10*/("""
        return error;
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/("""
        
        function trim(s)
        """),format.raw/*110.9*/("""{"""),format.raw/*110.10*/("""
        return s.replace(/^\s+|\s+$/, '');
        """),format.raw/*112.9*/("""}"""),format.raw/*112.10*/("""


        function validateEmail(fld) """),format.raw/*115.37*/("""{"""),format.raw/*115.38*/("""
        var error="";
        var tfld = trim(fld.value);                        // value of field with whitespace trimmed off
        var emailFilter = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]"""),format.raw/*118.72*/("""{"""),format.raw/*118.73*/("""2,4"""),format.raw/*118.76*/("""}"""),format.raw/*118.77*/("""$/;
        var illegalChars= /[\(\)\<\>\,\;\:\\\"\[\]]/ ;

        if (fld.value == "") """),format.raw/*121.30*/("""{"""),format.raw/*121.31*/("""

        error = "You didn't enter a email.\n";

        """),format.raw/*125.9*/("""}"""),format.raw/*125.10*/("""  else if (!emailFilter.test(tfld)) """),format.raw/*125.46*/("""{"""),format.raw/*125.47*/("""              //test email for illegal characters

        error = "Please enter a valid email address.\n";
        """),format.raw/*128.9*/("""}"""),format.raw/*128.10*/(""" else if (fld.value.match(illegalChars)) """),format.raw/*128.51*/("""{"""),format.raw/*128.52*/("""

        error = "The email address contains illegal characters.\n";
        """),format.raw/*131.9*/("""}"""),format.raw/*131.10*/("""
        return error;
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/("""

        
        
        function validatePassword(fld) """),format.raw/*137.40*/("""{"""),format.raw/*137.41*/("""
        var error = "";
        var illegalChars = /\W/; // allow letters, numbers, and underscores

        if (fld.value == "") """),format.raw/*141.30*/("""{"""),format.raw/*141.31*/("""

        error = "You didn't enter a password.\n";

        """),format.raw/*145.9*/("""}"""),format.raw/*145.10*/("""  else if ((fld.value.length < 6) || (fld.value.length > 15)) """),format.raw/*145.72*/("""{"""),format.raw/*145.73*/("""
        error = "The password should be between 6 to 15 length. \n";

        """),format.raw/*148.9*/("""}"""),format.raw/*148.10*/(""" else if (illegalChars.test(fld.value)) """),format.raw/*148.50*/("""{"""),format.raw/*148.51*/("""
        error = "The password contains illegal characters.\n";

        """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/(""" else if (!((fld.value.search(/(a-z)+/)) && (fld.value.search(/(0-9)+/)))) """),format.raw/*151.85*/("""{"""),format.raw/*151.86*/("""
        error = "The password must contain at least one numeral.\n";

        """),format.raw/*154.9*/("""}"""),format.raw/*154.10*/("""
        return error;
        """),format.raw/*156.9*/("""}"""),format.raw/*156.10*/("""

       






    </script>
        
        
    """)))})),format.raw/*168.6*/("""

""")))})),format.raw/*170.2*/("""
"""))}
    }
    
    def render(signupForm:Form[models.Member]): play.api.templates.HtmlFormat.Appendable = apply(signupForm)
    
    def f:((Form[models.Member]) => play.api.templates.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 08 19:08:22 IST 2014
                    SOURCE: C:/Users/Akash Singh/Desktop/ShopList/app/views/user/create.scala.html
                    HASH: e52537af2ee16ab42d51ece34c8f8c9b1961cd3f
                    MATRIX: 793->1|955->92|967->97|1051->101|1102->34|1132->113|1171->118|1203->142|1242->144|1286->153|1430->287|1471->289|1629->411|1819->579|1918->642|2105->807|2204->870|2488->1132|2599->1207|2850->1436|3078->1628|3093->1634|3143->1662|3315->1806|3344->1807|3642->2077|3671->2078|3790->2170|3819->2171|3880->2205|3909->2206|3983->2252|4012->2253|4213->2426|4242->2427|4335->2493|4364->2494|4433->2535|4462->2536|4566->2613|4595->2614|4671->2663|4700->2664|4801->2738|4830->2739|4890->2772|4919->2773|4992->2818|5021->2819|5222->2992|5251->2993|5343->3058|5372->3059|5441->3100|5470->3101|5574->3177|5604->3178|5681->3227|5711->3228|5812->3301|5842->3302|5903->3335|5933->3336|6007->3382|6037->3383|6119->3437|6149->3438|6220->3480|6250->3481|6480->3683|6510->3684|6542->3687|6572->3688|6693->3780|6723->3781|6813->3843|6843->3844|6908->3880|6938->3881|7085->4000|7115->4001|7185->4042|7215->4043|7324->4124|7354->4125|7415->4158|7445->4159|7537->4222|7567->4223|7731->4358|7761->4359|7854->4424|7884->4425|7975->4487|8005->4488|8115->4570|8145->4571|8214->4611|8244->4612|8348->4688|8378->4689|8482->4764|8512->4765|8622->4847|8652->4848|8713->4881|8743->4882|8840->4947|8877->4952
                    LINES: 26->1|31->5|31->5|33->5|36->1|38->7|40->9|40->9|40->9|42->11|42->11|42->11|47->16|50->19|54->23|57->26|61->30|65->34|69->38|72->41|78->47|78->47|78->47|82->51|82->51|90->59|90->59|93->62|93->62|96->65|96->65|99->68|99->68|104->73|104->73|108->77|108->77|108->77|108->77|111->80|111->80|113->82|113->82|115->84|115->84|117->86|117->86|120->89|120->89|125->94|125->94|129->98|129->98|129->98|129->98|132->101|132->101|134->103|134->103|136->105|136->105|138->107|138->107|141->110|141->110|143->112|143->112|146->115|146->115|149->118|149->118|149->118|149->118|152->121|152->121|156->125|156->125|156->125|156->125|159->128|159->128|159->128|159->128|162->131|162->131|164->133|164->133|168->137|168->137|172->141|172->141|176->145|176->145|176->145|176->145|179->148|179->148|179->148|179->148|182->151|182->151|182->151|182->151|185->154|185->154|187->156|187->156|199->168|201->170
                    -- GENERATED --
                */
            