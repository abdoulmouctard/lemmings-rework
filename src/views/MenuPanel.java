package views;

import controllers.Constants;
import models.Creator;
import models.TemporaryClass;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuPanel extends JPanel
{
    private List<JButton> buttons;
    private JButton play_and_pause;

    private static final int FULL_SIZE = Constants.WINDOW_WIDTH/5;

    public MenuPanel()
    {
        this.setLocation(Constants.WINDOW_WIDTH-Constants.WINDOW_WIDTH/5, 0);
        this.setSize(FULL_SIZE, Constants.WINDOW_HEIGHT);
        this.setBackground(Constants.COLOR_WHITE);

        this.play_and_pause = new JButton("PLAY");
        this.play_and_pause.setSize(FULL_SIZE,50);
        this.play_and_pause.setBackground(Constants.COLOR_RED);
        this.play_and_pause.setLocation(0, 0);
        this.play_and_pause.setFocusable(false);
        this.play_and_pause.setBorderPainted(false);
        this.add(this.play_and_pause);


        this.buttons = new ArrayList<>();

        this.initButtons(Arrays.asList("Bomber", "Borer"));
    }

    private void initButtons(List<String> strings)
    {
        Creator<TemporaryClass<Integer>> creator = TemporaryClass::new;

        var counter = creator.init();
        counter.variable = 0;

        strings.forEach(s -> {
            counter.variable ++;
            JButton button = new JButton(s);

            button.addActionListener(new ButtonActionListener(s));

            this.buttonMenuStyling(button, counter.variable);
            this.buttons.add(button);
        });

        this.buttons.forEach(this::add);
    }


    private void buttonMenuStyling(JButton button, int number)
    {
        int height = 40;
        button.setSize(FULL_SIZE, height);

        if (number%2 == 0) button.setBackground(Constants.COLOR_GREEN);
        else button.setBackground(Constants.COLOR_YELLOW);

        button.setFocusable(false);
        button.setBorderPainted(false);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        button.setLocation(0, (number - 1) * height + 50);
    }

}
