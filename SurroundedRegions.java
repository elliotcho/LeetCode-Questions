class Solution {
    public void solve(char[][] board) {
        if(board.length==0){return;}
        
        for(int i=0;i<board.length;i++){dfs(i, 0, board);}
        for(int i=0;i<board.length;i++){dfs(i, board[i].length-1, board);}
        for(int j=0;j<board[0].length;j++){dfs(0, j, board);}
        for(int j=0;j<board[0].length;j++){dfs(board.length-1, j, board);}
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='.'){
                    board[i][j]='O';
                }
                
                else{
                    board[i][j]='X';
                }
            }
        }
        
        return;
    }
    
    public void dfs(int i, int j, char[][] board){
        if(i<0 || j<0 || i>=board.length || j>=board[i].length || 
           board[i][j]=='.' || board[i][j]=='X'){
            return;
        }
        
        board[i][j]='.';
        
        dfs(i-1, j, board);
        dfs(i+1, j, board);
        dfs(i, j-1, board);
        dfs(i, j+1, board);
        
        return;
    }
}