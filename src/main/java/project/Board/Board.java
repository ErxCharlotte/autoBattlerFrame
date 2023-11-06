package project.Board;

import project.Player.Player;

/**
 * Board class simulates a 8x8 board.
 * <p>
 * It allow users place or remove their chess on the board.
 * The current status of each chess will be display on the board.
 * </p>
 */
public class Board {

    private int[][] board;
    public static int gridDistance = 1;
    private Player player;


    /**
     * Construct a new board which initialize size is 8x8.
     * Initializing with no chess in all positions.
     */
    public Board() {
        this.board = new int[8][8];
    }

    /**
     * Get the instance of the current board.
     */
    public int[][] getBoard() {
        return board;
    }

    /**
     * Get the instance of the current player.
     */
    public Player getPlayer() {
        return player;
    }

    public void setBoard(int[][] playerBoard, int[][] enemyPlayerBoard) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i][j] = enemyPlayerBoard[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i + 4][j] = playerBoard[i][j];
            }
        }
    }

    /**
     * Drawing the current status of the board.
     * Represented empty position by 0, otherwise 1.
     */
    public void draw() {
        for (int i = 0; i < board.length; i++) {
            if (i % 2 != 0) {
                System.out.print(" ");
            }
            for (int j = 0; j < this.board[i].length; j++) {
                System.out.print(this.board[i][j] == 0 ? "0" : "1");
            }
            System.out.println();
            if (i == 3){
                System.out.println("楚河汉界");
            }
        }
    }



}
