package project.Player;


public class Player{

    private Player enemyPlayer;
    private int[][] chessPositions;

    /**
     * Construct a new player.
     * Initializing with no chess in all positions.
     */
    public Player(){
        this.chessPositions = new int[8][3];
    }

    public void setEnemyPlayer(Player enemyPlayer) {
        this.enemyPlayer = enemyPlayer;
    }

    public Player getEnemyPlayer() {
        return this.enemyPlayer;
    }

    public int[][] getChessPositions() {
        return this.chessPositions;
    }

    /**
     * Placing or removing a chess on the board.
     *
     * @param x     X position of chess (0-3)
     * @param y     Y position of chess (0-3)
     * @param operation 1 for placing, 0 for removing.
     */
    public void setChessPosition(int x, int y, int operation) {
        if (x >= 0 && x < 4 && y >= 0 && y < 4) {
            this.chessPositions[x][y] = operation;
        } else {
            System.out.println("Incorrect Position!");
        }
    }

}
