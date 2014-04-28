// @SOURCE:C:/Users/Akash Singh/Desktop/ShopList/conf/routes
// @HASH:1b8a65d9eb03b0b3ec02faa71ad0ccc0d491d23b
// @DATE:Mon Apr 28 23:18:43 IST 2014


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
        

// @LINE:9
private[this] lazy val controllers_SearchController_searchByCategory3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search/category/"),DynamicPart("category", """[^/]+""",true))))
        

// @LINE:14
private[this] lazy val controllers_ShopController_viewAll4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/viewall"))))
        

// @LINE:15
private[this] lazy val controllers_ShopController_blank5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/create"))))
        

// @LINE:16
private[this] lazy val controllers_ShopController_profile6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/profile/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_ShopController_displayCategory7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/category"))))
        

// @LINE:18
private[this] lazy val controllers_ShopController_submit8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/create"))))
        

// @LINE:20
private[this] lazy val controllers_ShopController_edit9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:21
private[this] lazy val controllers_ShopController_update10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/update/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_ShopController_display11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_ShopController_profileFound12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop/found/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_UserController_login13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/login"))))
        

// @LINE:33
private[this] lazy val controllers_UserController_authenticate14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/login"))))
        

// @LINE:34
private[this] lazy val controllers_UserController_logout15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/logout"))))
        

// @LINE:36
private[this] lazy val controllers_UserController_blank16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/create"))))
        

// @LINE:37
private[this] lazy val controllers_UserController_submit17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/create"))))
        

// @LINE:38
private[this] lazy val controllers_UserController_account18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/account"))))
        

// @LINE:40
private[this] lazy val controllers_UserController_edit19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:41
private[this] lazy val controllers_UserController_update20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/update/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:50
private[this] lazy val controllers_ProductController_addProduct21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/addProduct"))))
        

// @LINE:51
private[this] lazy val controllers_ProductController_blank22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/add"))))
        

// @LINE:52
private[this] lazy val controllers_ProductController_save23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/save"))))
        

// @LINE:53
private[this] lazy val controllers_ProductController_delete24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:54
private[this] lazy val controllers_ProductController_showProducts25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:59
private[this] lazy val controllers_Assets_at26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.ApplicationController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.ApplicationController.about()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""","""controllers.SearchController.search()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search/category/$category<[^/]+>""","""controllers.SearchController.searchByCategory(category:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/viewall""","""controllers.ShopController.viewAll(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/create""","""controllers.ShopController.blank()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/profile/$id<[^/]+>""","""controllers.ShopController.profile(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/category""","""controllers.ShopController.displayCategory()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/create""","""controllers.ShopController.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/edit/$id<[^/]+>""","""controllers.ShopController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/update/$id<[^/]+>""","""controllers.ShopController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/$id<[^/]+>""","""controllers.ShopController.display(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop/found/$id<[^/]+>""","""controllers.ShopController.profileFound(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/login""","""controllers.UserController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/login""","""controllers.UserController.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/logout""","""controllers.UserController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/create""","""controllers.UserController.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/create""","""controllers.UserController.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/account""","""controllers.UserController.account()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/edit/$id<[^/]+>""","""controllers.UserController.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/update/$id<[^/]+>""","""controllers.UserController.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/addProduct""","""controllers.ProductController.addProduct()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/add""","""controllers.ProductController.blank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/save""","""controllers.ProductController.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/delete/$id<[^/]+>""","""controllers.ProductController.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/show/$id<[^/]+>""","""controllers.ProductController.showProducts(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:9
case controllers_SearchController_searchByCategory3(params) => {
   call(params.fromPath[String]("category", None)) { (category) =>
        invokeHandler(controllers.SearchController.searchByCategory(category), HandlerDef(this, "controllers.SearchController", "searchByCategory", Seq(classOf[String]),"GET", """""", Routes.prefix + """search/category/$category<[^/]+>"""))
   }
}
        

// @LINE:14
case controllers_ShopController_viewAll4(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.ShopController.viewAll(p, s, o, f), HandlerDef(this, "controllers.ShopController", "viewAll", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """ Shop Urls""", Routes.prefix + """shop/viewall"""))
   }
}
        

// @LINE:15
case controllers_ShopController_blank5(params) => {
   call { 
        invokeHandler(controllers.ShopController.blank(), HandlerDef(this, "controllers.ShopController", "blank", Nil,"GET", """""", Routes.prefix + """shop/create"""))
   }
}
        

// @LINE:16
case controllers_ShopController_profile6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ShopController.profile(id), HandlerDef(this, "controllers.ShopController", "profile", Seq(classOf[Long]),"GET", """""", Routes.prefix + """shop/profile/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_ShopController_displayCategory7(params) => {
   call { 
        invokeHandler(controllers.ShopController.displayCategory(), HandlerDef(this, "controllers.ShopController", "displayCategory", Nil,"GET", """""", Routes.prefix + """shop/category"""))
   }
}
        

// @LINE:18
case controllers_ShopController_submit8(params) => {
   call { 
        invokeHandler(controllers.ShopController.submit(), HandlerDef(this, "controllers.ShopController", "submit", Nil,"POST", """""", Routes.prefix + """shop/create"""))
   }
}
        

// @LINE:20
case controllers_ShopController_edit9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ShopController.edit(id), HandlerDef(this, "controllers.ShopController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """shop/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:21
case controllers_ShopController_update10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ShopController.update(id), HandlerDef(this, "controllers.ShopController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """shop/update/$id<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_ShopController_display11(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.ShopController.display(id), HandlerDef(this, "controllers.ShopController", "display", Seq(classOf[Int]),"GET", """""", Routes.prefix + """shop/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_ShopController_profileFound12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ShopController.profileFound(id), HandlerDef(this, "controllers.ShopController", "profileFound", Seq(classOf[Long]),"GET", """""", Routes.prefix + """shop/found/$id<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_UserController_login13(params) => {
   call { 
        invokeHandler(controllers.UserController.login(), HandlerDef(this, "controllers.UserController", "login", Nil,"GET", """ User Urls""", Routes.prefix + """user/login"""))
   }
}
        

// @LINE:33
case controllers_UserController_authenticate14(params) => {
   call { 
        invokeHandler(controllers.UserController.authenticate(), HandlerDef(this, "controllers.UserController", "authenticate", Nil,"POST", """""", Routes.prefix + """user/login"""))
   }
}
        

// @LINE:34
case controllers_UserController_logout15(params) => {
   call { 
        invokeHandler(controllers.UserController.logout(), HandlerDef(this, "controllers.UserController", "logout", Nil,"GET", """""", Routes.prefix + """user/logout"""))
   }
}
        

// @LINE:36
case controllers_UserController_blank16(params) => {
   call { 
        invokeHandler(controllers.UserController.blank(), HandlerDef(this, "controllers.UserController", "blank", Nil,"GET", """""", Routes.prefix + """user/create"""))
   }
}
        

// @LINE:37
case controllers_UserController_submit17(params) => {
   call { 
        invokeHandler(controllers.UserController.submit(), HandlerDef(this, "controllers.UserController", "submit", Nil,"POST", """""", Routes.prefix + """user/create"""))
   }
}
        

// @LINE:38
case controllers_UserController_account18(params) => {
   call { 
        invokeHandler(controllers.UserController.account(), HandlerDef(this, "controllers.UserController", "account", Nil,"GET", """""", Routes.prefix + """user/account"""))
   }
}
        

// @LINE:40
case controllers_UserController_edit19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UserController.edit(id), HandlerDef(this, "controllers.UserController", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """user/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:41
case controllers_UserController_update20(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UserController.update(id), HandlerDef(this, "controllers.UserController", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """user/update/$id<[^/]+>"""))
   }
}
        

// @LINE:50
case controllers_ProductController_addProduct21(params) => {
   call { 
        invokeHandler(controllers.ProductController.addProduct(), HandlerDef(this, "controllers.ProductController", "addProduct", Nil,"GET", """""", Routes.prefix + """product/addProduct"""))
   }
}
        

// @LINE:51
case controllers_ProductController_blank22(params) => {
   call { 
        invokeHandler(controllers.ProductController.blank(), HandlerDef(this, "controllers.ProductController", "blank", Nil,"GET", """""", Routes.prefix + """product/add"""))
   }
}
        

// @LINE:52
case controllers_ProductController_save23(params) => {
   call { 
        invokeHandler(controllers.ProductController.save(), HandlerDef(this, "controllers.ProductController", "save", Nil,"POST", """""", Routes.prefix + """product/save"""))
   }
}
        

// @LINE:53
case controllers_ProductController_delete24(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ProductController.delete(id), HandlerDef(this, "controllers.ProductController", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """product/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:54
case controllers_ProductController_showProducts25(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ProductController.showProducts(id), HandlerDef(this, "controllers.ProductController", "showProducts", Seq(classOf[Long]),"GET", """""", Routes.prefix + """product/show/$id<[^/]+>"""))
   }
}
        

// @LINE:59
case controllers_Assets_at26(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     