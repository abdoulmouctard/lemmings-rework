package models;

import models.lemming.Lemming;
import models.map.Board;
import java.util.ArrayList;
import java.util.List;

public class Model
{
    public static final int BOARD_HEIGHT = 50;
    public static final int BOARD_WIDTH = 50;
    private static final int NUMBER_OF_LEMMINGS = 7;

    private static Model instance = null;
    private Board board;
    private List<Lemming> lemmings;

    private Model()
    {
        this.board = new Board(Model.BOARD_WIDTH, Model.BOARD_HEIGHT);

        this.lemmings = new ArrayList<>();
        for (int i = 0; i < Model.NUMBER_OF_LEMMINGS; i++) {
            lemmings.add(new Lemming( this.board.getBlock( (i+3)*3, i * 5) ));
        }

        this.board.setLemmings(this.lemmings);
    }

    public List<Lemming> getLemmings() { return this.lemmings; }




    public Board getBoard() { return board; }

    public static int getBoardHeight() { return BOARD_HEIGHT; }

    public static int getBoardWidth() { return BOARD_WIDTH; }

    public static Model getInstance()
    {
        if (instance != null) return instance;
        boot();
        return instance;
    }

    public static void boot() { Model.instance = new Model(); }
}
