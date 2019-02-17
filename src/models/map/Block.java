package models.map;

import models.lemming.Lemming;
import views.Printable;

public abstract class Block implements BoardContainer, Printable
{
    private Lemming lemming;

    @Override
    public Location getLocation() { return null; }

    @Override
    public Lemming getLemming() { return this.lemming; }

    @Override
    public void addLemming(Lemming lemming) { this.lemming = lemming; }

    @Override
    public void removeLemming() { this.lemming = null; }

    @Override
    public boolean containLemming(Lemming lemming) { return this.lemming.equals(lemming); }

}
