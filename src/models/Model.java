package models;

import models.lemming.Lemming;
import models.map.Board;
import views.View;

import java.util.ArrayList;
import java.util.List;

public class Model implements Observer<View>
{
    private static final int BOARD_HEIGHT = 10;
    private static final int BOARD_WIDTH = 10;
    private static final int NUMBER_OF_LEMMINGS = 7;

    private static Model instance = null;
    private Board board;
    private List<Lemming> lemmings;

    private Model()
    {
        this.board = new Board(Model.BOARD_WIDTH, Model.BOARD_HEIGHT);

        this.lemmings = new ArrayList<>();
        for (int i = 0; i < Model.NUMBER_OF_LEMMINGS; i++)
            lemmings.add(new Lemming(this.board.getEntryBlock()));

    }

    public List<? extends Lemming> getLemmings() { return this.lemmings; }

    @Override
    public void update(Observable<View> observable)
    {

    }


    public Board getBoard() { return board; }

    public static int getBoardHeight() { return BOARD_HEIGHT; }

    public static int getBoardWidth() { return BOARD_WIDTH; }

    public static Model getInstance()
    {
        if (instance != null) return instance;

        Model.instance = new Model();

        return instance;
    }
}
