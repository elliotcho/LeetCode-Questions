class Solution {
    public boolean exist(char[][] board, String word) {
        if(word.length()==0){return true;}

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0) && dfs(i, j, board, 0, word)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean dfs(int i, int j, char[][] board, int index, String word){
        if(index==word.length()){return true;}
        
        if(i<0 || j<0 || i>=board.length || j>=board[i].length || 
           word.charAt(index)!=board[i][j]){
            return false;
        }
        
        char temp=board[i][j];
        
        board[i][j]=' ';
        
        boolean res=dfs(i-1, j, board, index+1, word) || 
            dfs(i+1, j, board, index+1, word) || 
            dfs(i, j-1, board, index+1, word) || 
            dfs(i, j+1, board, index+1, word);
        
        board[i][j]=temp;
        
        return res;
    }
}