package views;

import models.Observable;
import models.Observer;

public class View implements Observable<View>
{
    private Window window;
    private BoardPanel boardPanel;
    private MenuPanel menuPanel;

    public View()
    {
        this.window = new Window();
        this.boardPanel = new BoardPanel();
        this.menuPanel = new MenuPanel();

        this.window.add(this.boardPanel);
        this.window.add(this.menuPanel);
    }

    @Override
    public void register(Observer observer)
    {
    }

    @Override
    public void unregister(Observer observer)
    {

    }

    @Override
    public View getInstance() { return this; }

    @Override
    public void notifyObservers() {}

    public void update() {
        this.window.repaint();
        this.boardPanel.repaint();
        this.menuPanel.repaint();
    }
}
