package views;

import models.Model;
import models.map.Block;

import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseMotionListener implements java.awt.event.MouseMotionListener
{

    private BoardPanel panel;

    MouseMotionListener(BoardPanel panel) { this.panel = panel; }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) { }

    @Override
    public void mouseMoved(MouseEvent mouseEvent)
    {
        Block block = Model
                .getInstance()
                .getBoard()
                .getBlock(mouseEvent.getX(), mouseEvent.getY());

        if (block != null && block.getLemming() != null) {
            this.panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        } else {
            this.panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }
}
