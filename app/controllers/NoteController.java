package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class NoteController extends Controller {

    public Result note() {

        return ok(views.html.note.render());
    }
}
