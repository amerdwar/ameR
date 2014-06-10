package controllers;

import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Transactional;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render());
	}

	@Transactional
	public static Result eqS() {
		double a = 0, b = 0, c = 0;
		String x1, x2;
		DynamicForm frm = Form.form().bindFromRequest();
		a = Double.parseDouble(frm.get("a"));
		b = Double.parseDouble(frm.get("b"));
		c = Double.parseDouble(frm.get("c"));
		double d = (b*b) - 4 * a * c;
		if (d >= 0) {
			x1 =String.valueOf((-b + Math.sqrt(d)) / (2 * a));
			x2 =String.valueOf((-b - Math.sqrt(d)) / (2 * a));
		} else {
			
			x1 ="not solvable in R";
				
			x2 ="not solvable in R";
				
		}
		return ok(solution.render(x1, x2));
	}
}
