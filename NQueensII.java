class Solution {
    public int totalNQueens(int n) {
        int[] res={0};
        
        char[][] board=new char[n][n];
        
        dfs(res, board, 0);
        
        return res[0];
    }
    
    private void dfs(int[] res, char[][] board, int level){
        if(level==board.length){
            res[0]++;
            return;
        }
        
        for(int j=0;j<board[level].length;j++){
            if(isValid(level, j, board)){
                board[level][j]='Q';
                
                dfs(res, board, level+1);
                
                board[level][j]='.';
            }
        }
    }
    
    private boolean isValid(int row, int col, char[][] board){
        for(int i=0;i<row;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='Q' && (col==j || row+j==col+i || row+col==i+j)){
                    return false;
                }
            }
        }
        
        return true;
    }
}