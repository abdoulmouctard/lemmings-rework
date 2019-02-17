package models.map;

public class Board
{
    private BoardContainer[][] board;

    public Board(int width, int height)
    {
        board = new BoardContainer[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++)
                board[i][i] = BlockFactory.make("indestructible");
        }
    }

    public BoardContainer[][] getBoard() { return board; }
    public int getWidth() { return this.board.length; }
    public int getHeight() { return this.board[0].length; }

    public BoardContainer getEntryBlock() { return this.board[0][0]; }
    public BoardContainer getExitBlock() { return null; }
}
