package models.lemming;

import controllers.Constants;
import models.map.BoardContainer;
import models.map.Location;
import views.Printable;

import java.awt.*;

import static models.map.Block.WIDTH_SCALE;
import static models.map.Block.HEIGHT_SCALE;

public class Lemming implements Printable
{
    private Color color;
    private State state;
    private Location location;
    private Direction direction;
    private boolean live;

    public Lemming(BoardContainer container)
    {
        this.state = new WalkerState();
        this.location = container.getLocation();
        this.direction = Direction.LEFT;
        this.live = true;
        this.color = Constants.COLOR_PURPLE;
    }

    public boolean isLive() { return this.live; }

    public void step() { this.state.action(); }

    public State getState() { return state; }
    public void setState(State state) { this.state = state; }

    public Location getLocation() { return location; }

    public Direction getDirection() { return direction; }

    @Override
    public void print(Graphics graphics, Location location)
    {
        graphics.setColor(this.color);
        int x = location.getX();
        int y = location.getY();
        graphics.fillOval(x, y, x + WIDTH_SCALE/2 - 5, y + HEIGHT_SCALE);
    }


    @Override
    public boolean equals(Object object)
    {
        if (!(object instanceof Lemming)) return false;

        return this.hashCode() == object.hashCode();
    }

    public boolean falling() { return false; }

    public void updateState() { this.state = new WalkerState(); }

    @Override
    public String toString()
    {
        return "Lemming: DIRECTION" + this.direction +" | " + this.location;
    }
}
