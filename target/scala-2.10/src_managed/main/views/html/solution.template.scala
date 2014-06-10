
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
object solution extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(x1:String,x2:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""
<html>
<title>the solution of the eqution </title>
<body bgcolor='blue'>
	
	"""),_display_(Seq[Any](/*6.3*/helper/*6.9*/.form(action=routes.Application.eqS)/*6.45*/{_display_(Seq[Any](format.raw/*6.46*/("""
	  x1="""),_display_(Seq[Any](/*7.8*/x1)),format.raw/*7.10*/(""" ,X2="""),_display_(Seq[Any](/*7.16*/x2)),format.raw/*7.18*/("""
	
	""")))})),format.raw/*9.3*/("""
</body>
</html>"""))}
    }
    
    def render(x1:String,x2:String): play.api.templates.HtmlFormat.Appendable = apply(x1,x2)
    
    def f:((String,String) => play.api.templates.HtmlFormat.Appendable) = (x1,x2) => apply(x1,x2)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 10 11:03:18 EEST 2014
                    SOURCE: H:/eq2/app/views/solution.scala.html
                    HASH: dfc8d34c408f371fc32af0779336c6d518b6398c
                    MATRIX: 784->1|899->22|1011->100|1024->106|1068->142|1106->143|1148->151|1171->153|1212->159|1235->161|1270->166
                    LINES: 26->1|29->1|34->6|34->6|34->6|34->6|35->7|35->7|35->7|35->7|37->9
                    -- GENERATED --
                */
            