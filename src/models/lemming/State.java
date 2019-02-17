package models.lemming;

public abstract class State
{
    protected Lemming lemming;

    public void setLemming(Lemming lemming) { this.lemming = lemming; }

    public abstract void action();
}
