package views;

import controllers.Controller;
import models.StateFactory;
import models.lemming.State;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonActionListener implements ActionListener
{
    private final String actionName;

    ButtonActionListener(String name) { this.actionName = name; }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (Controller.currentLemming != null)
            Controller.currentLemming.setState(StateFactory.make(this.actionName));

        System.out.println(this.actionName);
    }
}
