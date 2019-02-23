package views;

import models.Model;
import models.map.Board;
import models.map.BoardContainer;

import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel
{
    public static final int WIDTH = Window.WIDTH - Window.WIDTH/5;
    public static final int HEIGHT = Window.HEIGHT;

    BoardPanel()
    {
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(0, 0);

        this.addMouseListener(new MouseActionListener(this));
        this.addMouseMotionListener(new MouseMotionListener(this));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        Board board = Model.getInstance().getBoard();
        BoardContainer[][] containers = board.getBlocks();

        for (BoardContainer[] cs : containers) {
            for (BoardContainer c: cs) c.print(g, c.getLocation());
        }
    }
}
