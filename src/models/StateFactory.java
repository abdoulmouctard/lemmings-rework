package models;

import models.lemming.*;

public class StateFactory
{
    private StateFactory(){}

    public static State make(String name)
    {
        name = name.toLowerCase();

        if (name.contains("bomber")) return new BomberState();
        if (name.contains("borer")) return new BorerState();
        if (name.contains("climber")) return new ClimberState();
        if (name.contains("furrier")) return new FurrierState();
        if (name.contains("parachutist")) return new ParachutistState();

        return new WalkerState();
    }

}
