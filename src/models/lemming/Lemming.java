package models.lemming;

import models.map.Block;
import models.map.BoardContainer;
import models.map.Location;
import views.Printable;

import java.awt.*;

public class Lemming implements Printable
{
    private State state;
    private Location location;
    private Direction direction;
    private int life = 1;

    public Lemming(BoardContainer container)
    {
        this.state = new WalkerState();
        this.location = container.getLocation();
        this.direction = Direction.LEFT;
    }

    public boolean live() { return this.life > 0; }

    public void step() { this.state.action(); }

    public State getState() { return state; }
    public void setState(State state) { this.state = state; }

    public Location getLocation() { return location; }

    public Direction getDirection() { return direction; }

    @Override
    public void print(Graphics graphics)
    {

    }


    @Override
    public boolean equals(Object object)
    {
        if (!(object instanceof Lemming)) return false;

        return this.hashCode() == object.hashCode();
    }

    public boolean falling() { return false; }

    public void updateState()
    {
        this.state = new WalkerState();
    }
}
