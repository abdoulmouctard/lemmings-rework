package views;

import controllers.Controller;
import models.Model;
import models.map.Block;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseActionListener implements MouseListener
{
    private final BoardPanel panel;

    MouseActionListener(BoardPanel panel) { this.panel = panel; }

    @Override
    public void mouseClicked(MouseEvent mouseEvent)
    {
        Block block = Model
                .getInstance()
                .getBoard()
                .getBlock(mouseEvent.getX(), mouseEvent.getY());

        Controller.setCurrentBlock(block);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) { }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) { }

    @Override
    public void mouseEntered(MouseEvent mouseEvent)
    {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent)
    {

    }
}
