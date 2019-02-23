package models.map;

import models.Model;
import models.lemming.Lemming;
import views.BoardPanel;
import views.Printable;

public abstract class Block implements BoardContainer, Printable
{
    private final Location location;
    public static final int WIDTH_SCALE = BoardPanel.WIDTH / Model.BOARD_WIDTH;
    public static final int HEIGHT_SCALE = BoardPanel.HEIGHT / Model.BOARD_HEIGHT;

    Block(int i, int j)
    {
        this.location = new Location(i, j);
    }
    private Lemming lemming;

    @Override
    public Location getLocation() { return this.location; }

    @Override
    public Lemming getLemming() { return this.lemming; }

    @Override
    public void addLemming(Lemming lemming) { this.lemming = lemming; }

    @Override
    public void removeLemming() { this.lemming = null; }

    @Override
    public boolean containLemming(Lemming lemming) { return this.lemming.equals(lemming); }

}
