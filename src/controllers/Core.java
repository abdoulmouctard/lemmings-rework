package controllers;

import models.Model;
import views.View;

public class Core implements Runnable
{
    private Controller controller;
    private View view;

    public Core()
    {
        this.controller = new Controller();
        this.view = new View();
        Model.boot();
        this.view.register(this.controller);
    }


    public void run()
    {
        while (this.controller.inprogress()) {
            this.view.update();
            this.controller.step();

            try { Thread.sleep(Controller.REFRESH_TIMER); }
            catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
