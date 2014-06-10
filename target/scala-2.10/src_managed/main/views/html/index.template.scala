
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html>
<title>eq solver using play framework</title>
<body bgcolor='blue'>
	
	"""),_display_(Seq[Any](/*5.3*/helper/*5.9*/.form(action=routes.Application.eqS)/*5.45*/{_display_(Seq[Any](format.raw/*5.46*/("""
	<center>
		<input type="text" name="a"/>x^2
        <input type="text" name="b"/>x
	    <input type="text" name="c"/>=0</p>
	    
		<input type="submit"/>
		</center>
		
	""")))})),format.raw/*14.3*/("""
</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 10 11:03:18 EEST 2014
                    SOURCE: H:/eq2/app/views/index.scala.html
                    HASH: c74f4d09f0fc288c7e9b8789f253bf932749369c
                    MATRIX: 855->0|968->79|981->85|1025->121|1063->122|1268->296
                    LINES: 29->1|33->5|33->5|33->5|33->5|42->14
                    -- GENERATED --
                */
            