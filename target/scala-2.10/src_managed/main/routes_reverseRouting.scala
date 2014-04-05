// @SOURCE:C:/Users/Akash Singh/Desktop/ShopList/conf/routes
// @HASH:7250c4ad489cb817852ad6ee013aa2ecefa89f46
// @DATE:Tue Apr 01 22:26:22 IST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:35
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplicationController {
    

// @LINE:7
def about(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseProductController {
    

// @LINE:29
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "product/add")
}
                                                

// @LINE:28
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "product/add")
}
                                                

// @LINE:30
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "product/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:31
def afterDeletion(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "product/delete")
}
                                                
    
}
                          

// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseUserController {
    

// @LINE:22
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "user/create")
}
                                                

// @LINE:19
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/logout")
}
                                                

// @LINE:21
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/create")
}
                                                

// @LINE:18
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "user/login")
}
                                                

// @LINE:17
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/login")
}
                                                
    
}
                          

// @LINE:8
class ReverseSearchController {
    

// @LINE:8
def search(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "search")
}
                                                
    
}
                          

// @LINE:14
// @LINE:12
// @LINE:11
class ReverseShopController {
    

// @LINE:11
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shop/create")
}
                                                

// @LINE:14
def display(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shop/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:12
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shop/create")
}
                                                
    
}
                          
}
                  


// @LINE:35
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:7
// @LINE:6
class ReverseApplicationController {
    

// @LINE:7
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ApplicationController.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ApplicationController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseProductController {
    

// @LINE:29
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "product/add"})
      }
   """
)
                        

// @LINE:28
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/add"})
      }
   """
)
                        

// @LINE:30
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:31
def afterDeletion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProductController.afterDeletion",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/delete"})
      }
   """
)
                        
    
}
              

// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseUserController {
    

// @LINE:22
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/create"})
      }
   """
)
                        

// @LINE:19
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/logout"})
      }
   """
)
                        

// @LINE:21
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/create"})
      }
   """
)
                        

// @LINE:18
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/login"})
      }
   """
)
                        

// @LINE:17
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/login"})
      }
   """
)
                        
    
}
              

// @LINE:8
class ReverseSearchController {
    

// @LINE:8
def search : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SearchController.search",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
      }
   """
)
                        
    
}
              

// @LINE:14
// @LINE:12
// @LINE:11
class ReverseShopController {
    

// @LINE:11
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShopController.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/create"})
      }
   """
)
                        

// @LINE:14
def display : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShopController.display",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:12
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ShopController.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shop/create"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:35
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplicationController {
    

// @LINE:7
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ApplicationController.about(), HandlerDef(this, "controllers.ApplicationController", "about", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ApplicationController.index(), HandlerDef(this, "controllers.ApplicationController", "index", Seq(), "GET", """ Application Urls""", _prefix + """""")
)
                      
    
}
                          

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseProductController {
    

// @LINE:29
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.save(), HandlerDef(this, "controllers.ProductController", "save", Seq(), "POST", """""", _prefix + """product/add""")
)
                      

// @LINE:28
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.blank(), HandlerDef(this, "controllers.ProductController", "blank", Seq(), "GET", """ Product Urls""", _prefix + """product/add""")
)
                      

// @LINE:30
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.delete(id), HandlerDef(this, "controllers.ProductController", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """product/delete/$id<[^/]+>""")
)
                      

// @LINE:31
def afterDeletion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProductController.afterDeletion(), HandlerDef(this, "controllers.ProductController", "afterDeletion", Seq(), "GET", """""", _prefix + """product/delete""")
)
                      
    
}
                          

// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseUserController {
    

// @LINE:22
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.submit(), HandlerDef(this, "controllers.UserController", "submit", Seq(), "POST", """""", _prefix + """user/create""")
)
                      

// @LINE:19
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.logout(), HandlerDef(this, "controllers.UserController", "logout", Seq(), "GET", """""", _prefix + """user/logout""")
)
                      

// @LINE:21
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.blank(), HandlerDef(this, "controllers.UserController", "blank", Seq(), "GET", """""", _prefix + """user/create""")
)
                      

// @LINE:18
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.authenticate(), HandlerDef(this, "controllers.UserController", "authenticate", Seq(), "POST", """""", _prefix + """user/login""")
)
                      

// @LINE:17
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.login(), HandlerDef(this, "controllers.UserController", "login", Seq(), "GET", """ User Urls""", _prefix + """user/login""")
)
                      
    
}
                          

// @LINE:8
class ReverseSearchController {
    

// @LINE:8
def search(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SearchController.search(), HandlerDef(this, "controllers.SearchController", "search", Seq(), "POST", """""", _prefix + """search""")
)
                      
    
}
                          

// @LINE:14
// @LINE:12
// @LINE:11
class ReverseShopController {
    

// @LINE:11
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShopController.blank(), HandlerDef(this, "controllers.ShopController", "blank", Seq(), "GET", """ Shop Urls""", _prefix + """shop/create""")
)
                      

// @LINE:14
def display(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShopController.display(id), HandlerDef(this, "controllers.ShopController", "display", Seq(classOf[Int]), "GET", """POST    /shop/update/:id           controllers.ShopController.update(id:Int)""", _prefix + """shop/$id<[^/]+>""")
)
                      

// @LINE:12
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ShopController.submit(), HandlerDef(this, "controllers.ShopController", "submit", Seq(), "POST", """""", _prefix + """shop/create""")
)
                      
    
}
                          
}
        
    