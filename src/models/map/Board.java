package models.map;

import models.Creator;
import models.TemporaryClass;
import models.lemming.Lemming;

import java.util.List;

import static models.map.Block.HEIGHT_SCALE;
import static models.map.Block.WIDTH_SCALE;

public class Board
{
    private Block[][] blocks;

    public Board(int width, int height)
    {
        blocks = new Block[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++)
                blocks[i][j] = BlockFactory.make("destructible", i, j);
        }
    }

    public Block[][] getBlocks() { return blocks; }

    public int getWidth() { return this.blocks.length; }
    public int getHeight() { return this.blocks[0].length; }

    public Block getEntryBlock() { return this.blocks[0][0]; }
    public Block getExitBlock() { return this.blocks[0][0]; }

    public boolean isValidCoordinate(int x, int y)
    {
        return x >= 0 && y >= 0
                && x < this.blocks.length && y < this.blocks[0].length;
    }


    public Block getBlock(int x, int y)
    {
        int i = x / WIDTH_SCALE;
        int j = y / HEIGHT_SCALE;

        if (this.isValidCoordinate(i, j)) {
            return this.blocks[i][j];
        }
        return null;
    }

    public void setLemmings(List<Lemming> lemmings)
    {
        Creator<TemporaryClass<Integer>> creator = TemporaryClass::new;

        TemporaryClass<Integer> temporary_x = creator.init();
        TemporaryClass<Integer> temporary_y = creator.init();

        lemmings.forEach(lemming -> {
            temporary_x.variable = lemming.getLocation().getX();
            temporary_y.variable = lemming.getLocation().getY();

            if (this.isValidCoordinate(temporary_x.variable, temporary_y.variable))
                this.blocks[temporary_x.variable][temporary_y.variable].addLemming(lemming);
        });
    }
}
