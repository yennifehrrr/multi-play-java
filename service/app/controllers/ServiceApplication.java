package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by 206812 on 6/5/15.
 */
public class ServiceApplication extends Controller {

    public static Result get() {
        return ok("hi!");
    }

}
