package controllers;

import models.Note;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    public static List<Note> notes = new ArrayList<>();


    public Result index() throws InterruptedException {


        Note note1 = new Note();
        note1.setId(1);
        note1.setTitle("eine Notiz");
        note1.setNote("Note I...");
        note1.setLastEdited(new Date());
        notes.add(note1);

        Note note2 = new Note();
        note2.setId(2);
        note2.setTitle("zweite Notiz");
        note2.setNote("Note II...");
        note2.setLastEdited(new Date());
        notes.add(note2);

        return ok(views.html.index.render(notes));
    }

}
