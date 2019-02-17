package views;

import controllers.Constants;

import javax.swing.*;

class BoardPanel extends JPanel
{
    BoardPanel()
    {
        this.setBackground(Constants.COLOR_PURPLE);
        this.setSize(Constants.WINDOW_WIDTH - Constants.WINDOW_WIDTH/5, Constants.WINDOW_HEIGHT);
        this.setLocation(0, 0);
    }
}
