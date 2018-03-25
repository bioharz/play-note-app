package controllers;

import play.Logger;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class NoteController extends Controller {

    @Inject
    FormFactory formFactory;

    public Result editNote(int id) {

        return ok(views.html.note.render(HomeController.notes.get(id - 1)));
    }


    public Result editNoteSubmit(int id) {

        DynamicForm dynamicForm = this.formFactory.form().bindFromRequest();
        Logger.info("Username is: " + dynamicForm.get("username"));
        Logger.info("Password is: " + dynamicForm.get("password"));

        Logger.info("title is: " + dynamicForm.get("title"));
        Logger.info("note is: " + dynamicForm.get("note"));
        return ok("ok, I recived POST data. That's all...");
    }


    public Result note() {

        return ok(views.html.note.render(null));
    }
}
