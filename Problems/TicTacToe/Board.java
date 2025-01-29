package Problems.TicTacToe;


import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    PlayingPeice[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPeice[size][size];
    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j] + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }

    public List<Pair> getFreeCells() {
        List<Pair> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    Pair rowColumn = new Pair(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
    }

    public boolean addPiece(int row, int column, PlayingPeice playingPiece) {

        if (board[row][column] != null) {
            return false;
        }
        board[row][column] = playingPiece;
        return true;
    }
}
