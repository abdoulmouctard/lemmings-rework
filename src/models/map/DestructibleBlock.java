package models.map;

import controllers.Constants;
import models.lemming.Lemming;

import java.awt.*;

public class DestructibleBlock extends Block
{

    DestructibleBlock(int i, int j) { super(i, j); }

    @Override
    public void print(Graphics graphics, Location location)
    {
        int x = location.getX() * WIDTH_SCALE;
        int y = location.getY() * HEIGHT_SCALE;

        Lemming lemming = this.getLemming();

        if ((x+y)%3==0) graphics.setColor(Constants.COLOR_GREEN);
        else graphics.setColor(Color.CYAN);

        graphics.fillRect(x, y, x + WIDTH_SCALE, y + HEIGHT_SCALE);

        if (lemming != null) {
            lemming.print(graphics, new Location(x, y));
        }
    }
}
