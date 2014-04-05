// @SOURCE:C:/Users/Akash Singh/Desktop/ShopList/conf/routes
// @HASH:7250c4ad489cb817852ad6ee013aa2ecefa89f46
// @DATE:Tue Apr 01 22:26:22 IST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_ApplicationController_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_ApplicationController_about1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
        

// @LINE:8
private[this] lazy val controllers_SearchController_search2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search"))))
        

// @LINE:11
private[this] lazy val controllers_ShopController_blank3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/create"))))
        

// @LINE:12
private[this] lazy val controllers_ShopController_submit4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/create"))))
        

// @LINE:14
private[this] lazy val controllers_ShopController_display5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_UserController_login6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/login"))))
        

// @LINE:18
private[this] lazy val controllers_UserController_authenticate7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/login"))))
        

// @LINE:19
private[this] lazy val controllers_UserController_logout8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/logout"))))
        

// @LINE:21
private[this] lazy val controllers_UserController_blank9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/create"))))
        

// @LINE:22
private[this] lazy val controllers_UserController_submit10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/create"))))
        

// @LINE:28
private[this] lazy val controllers_ProductController_blank11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/add"))))
        

// @LINE:29
private[this] lazy val controllers_ProductController_save12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/add"))))
        

// @LINE:30
private[this] lazy val controllers_ProductController_delete13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:31
private[this] lazy val controllers_ProductController_afterDeletion14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/delete"))))
        

// @LINE:35
private[this] lazy val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.ApplicationController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.ApplicationController.about()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.SearchController.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/create""","""controllers.ShopController.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/create""","""controllers.ShopController.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/$id<[^/]+>""","""controllers.ShopController.display(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/login""","""controllers.UserController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/login""","""controllers.UserController.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/logout""","""controllers.UserController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/create""","""controllers.UserController.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/create""","""controllers.UserController.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/add""","""controllers.ProductController.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/add""","""controllers.ProductController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/delete/$id<[^/]+>""","""controllers.ProductController.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/delete""","""controllers.ProductController.afterDeletion()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_ApplicationController_index0(params) => {
   call { 
        invokeHandler(controllers.ApplicationController.index(), HandlerDef(this, "controllers.ApplicationController", "index", Nil,"GET", """ Application Urls""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_ApplicationController_about1(params) => {
   call { 
        invokeHandler(controllers.ApplicationController.about(), HandlerDef(this, "controllers.ApplicationController", "about", Nil,"GET", """""", Routes.prefix + """about"""))
   }
}
        

// @LINE:8
case controllers_SearchController_search2(params) => {
   call { 
        invokeHandler(controllers.SearchController.search(), HandlerDef(this, "controllers.SearchController", "search", Nil,"POST", """""", Routes.prefix + """search"""))
   }
}
        

// @LINE:11
case controllers_ShopController_blank3(params) => {
   call { 
        invokeHandler(controllers.ShopController.blank(), HandlerDef(this, "controllers.ShopController", "blank", Nil,"GET", """ Shop Urls""", Routes.prefix + """shop/create"""))
   }
}
        

// @LINE:12
case controllers_ShopController_submit4(params) => {
   call { 
        invokeHandler(controllers.ShopController.submit(), HandlerDef(this, "controllers.ShopController", "submit", Nil,"POST", """""", Routes.prefix + """shop/create"""))
   }
}
        

// @LINE:14
case controllers_ShopController_display5(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.ShopController.display(id), HandlerDef(this, "controllers.ShopController", "display", Seq(classOf[Int]),"GET", """POST    /shop/update/:id           controllers.ShopController.update(id:Int)""", Routes.prefix + """shop/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_UserController_login6(params) => {
   call { 
        invokeHandler(controllers.UserController.login(), HandlerDef(this, "controllers.UserController", "login", Nil,"GET", """ User Urls""", Routes.prefix + """user/login"""))
   }
}
        

// @LINE:18
case controllers_UserController_authenticate7(params) => {
   call { 
        invokeHandler(controllers.UserController.authenticate(), HandlerDef(this, "controllers.UserController", "authenticate", Nil,"POST", """""", Routes.prefix + """user/login"""))
   }
}
        

// @LINE:19
case controllers_UserController_logout8(params) => {
   call { 
        invokeHandler(controllers.UserController.logout(), HandlerDef(this, "controllers.UserController", "logout", Nil,"GET", """""", Routes.prefix + """user/logout"""))
   }
}
        

// @LINE:21
case controllers_UserController_blank9(params) => {
   call { 
        invokeHandler(controllers.UserController.blank(), HandlerDef(this, "controllers.UserController", "blank", Nil,"GET", """""", Routes.prefix + """user/create"""))
   }
}
        

// @LINE:22
case controllers_UserController_submit10(params) => {
   call { 
        invokeHandler(controllers.UserController.submit(), HandlerDef(this, "controllers.UserController", "submit", Nil,"POST", """""", Routes.prefix + """user/create"""))
   }
}
        

// @LINE:28
case controllers_ProductController_blank11(params) => {
   call { 
        invokeHandler(controllers.ProductController.blank(), HandlerDef(this, "controllers.ProductController", "blank", Nil,"GET", """ Product Urls""", Routes.prefix + """product/add"""))
   }
}
        

// @LINE:29
case controllers_ProductController_save12(params) => {
   call { 
        invokeHandler(controllers.ProductController.save(), HandlerDef(this, "controllers.ProductController", "save", Nil,"POST", """""", Routes.prefix + """product/add"""))
   }
}
        

// @LINE:30
case controllers_ProductController_delete13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ProductController.delete(id), HandlerDef(this, "controllers.ProductController", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """product/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:31
case controllers_ProductController_afterDeletion14(params) => {
   call { 
        invokeHandler(controllers.ProductController.afterDeletion(), HandlerDef(this, "controllers.ProductController", "afterDeletion", Nil,"GET", """""", Routes.prefix + """product/delete"""))
   }
}
        

// @LINE:35
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     