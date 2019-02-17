package controllers;

import models.lemming.Lemming;
import models.Model;
import models.Observable;
import models.Observer;
import views.View;

public class Controller implements Observer<View>
{
    private boolean stop;
    private Model model;
    static final long REFRESH_TIMER = 200;

    public static Lemming currentLemming = null;

    Controller(Model model)
    {
        this.model = model;
        this.stop = false;
    }

    boolean inprogress()
    {
        if (!stop) return false;

        return this.model.getLemmings().stream().anyMatch(Lemming::live);
    }

    void step()
    {
        this.model.getLemmings()
            .stream()
            .filter(Lemming::live)
            .forEach(Lemming::step);
    }

    @Override
    public void update(Observable<View> observable)
    {

    }
}
