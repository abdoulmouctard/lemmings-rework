package views;

import javax.swing.*;

class Window extends JFrame
{
    private static final String title = "LEMMINGS GAME";

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 700;

    Window()
    {
        super(title);
        this.setResizable(false);
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(100, 50);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
