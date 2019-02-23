package controllers;

import models.lemming.Lemming;
import models.Model;
import models.Observable;
import models.Observer;
import models.map.Block;
import views.View;

public class Controller implements Observer<View>
{
    private boolean stop;
    static final long REFRESH_TIMER = 200;

    private static Block currentBlock = null;

    Controller() { this.stop = false; }

    boolean inprogress()
    {
        if (stop) return false;
        return Model.getInstance().getLemmings().stream().anyMatch(Lemming::isLive);
    }

    void step()
    {
        Model.getInstance().getLemmings()
            .stream()
            .filter(Lemming::isLive)
            .forEach(Lemming::step);
    }

    public static void setCurrentBlock(Block currentBlock) { Controller.currentBlock = currentBlock; }

    public static Block getCurrentBlock() { return currentBlock; }

    @Override
    public void update(Observable<View> observable)
    {
    }
}
