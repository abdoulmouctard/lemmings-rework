package controllers;

import models.Model;
import views.View;

public class Core implements Runnable
{
    private Controller controller;
    private Model model;
    private View view;

    public Core()
    {
        this.controller = new Controller(null);
        this.view = new View();
        this.model = Model.getInstance();

        this.view.register(this.controller);
        this.view.register(this.model);
    }


    public void run()
    {
        while (this.controller.inprogress()) {

            try { Thread.sleep(Controller.REFRESH_TIMER); }
            catch (InterruptedException e) { e.printStackTrace(); }
            this.view.update();
            this.controller.step();
        }
    }
}
