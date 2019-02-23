package views;

import controllers.Controller;
import models.StateFactory;
import models.map.Block;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonActionListener implements ActionListener
{
    private final String actionName;

    ButtonActionListener(String name) { this.actionName = name; }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        Block block =Controller.getCurrentBlock();

        if (block != null && block.getLemming() != null)
            block.getLemming().setState(StateFactory.make(this.actionName));
    }
}
