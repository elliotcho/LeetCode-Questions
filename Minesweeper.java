class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        if(click.length!=2){return board;}
        
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1},{-1,1},{1,-1},{-1,-1},{1,1}};
        
        if(board[click[0]][click[1]]=='M'){
            board[click[0]][click[1]]='X';
        }
        
        else{
            dfs(click[0], click[1], board, directions);
        }
        
        return board;
    }
    
    private void dfs(int i, int j, char[][] board, int[][] directions){
        if(i<0 || j<0 || i>=board.length || j>=board[i].length || board[i][j]!='E'){
            return;
        }
        
        int mines=countAdjMines(i, j, board, directions);
        
        if(mines!=0){
            board[i][j]=(char)(mines+'0');
        }
        
        else{
            board[i][j]='B';
            
            for(int[] d: directions){
                dfs(i+d[0], j+d[1], board, directions);
            }
        }
        
        return;
    }
    
    private int countAdjMines(int i, int j, char[][] board, int[][] directions){
        int res=0;
        
        int m=board.length;
        int n=board[i].length;
        
        for(int d[]: directions){
            int row=i+d[0];
            int col=j+d[1];
            
            if(row>=0 && col>=0 && row<m && col<n && board[row][col]=='M'){
                res++;
            }
        }
        
        return res;
    }
}