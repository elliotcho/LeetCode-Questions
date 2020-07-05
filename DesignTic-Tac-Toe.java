class TicTacToe {
    int[] rows;
    int[] cols;
    int diagonalSum;
    int antiDiagonalSum;
    int n;

    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        rows=new int[n];
        cols=new int[n];
        
        int diagonalSum=0;
        int antiDiagonalSum=0;
        
        this.n=n;
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int playerVal = (player == 1)? 1: -1;
        
        if(row==col){
            diagonalSum+=playerVal;
        }
        
        if(col == (n-1-row)){
            antiDiagonalSum+=playerVal;
        }
        
        rows[row]+=playerVal;
        cols[col]+=playerVal;
        
        if(Math.abs(rows[row])==n || 
           Math.abs(cols[col])==n || 
           Math.abs(diagonalSum)==n || 
           Math.abs(antiDiagonalSum)==n){
            return player;
        }
        
        return 0;
    }
}
/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */