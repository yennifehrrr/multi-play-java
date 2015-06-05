package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Created by 206812 on 6/5/15.
 */
public class UIApplication extends Controller {

    public static Result get() {
        return ok(index.render("UI Title page"));
    }


}
