class Solution {
    public List<List<String>> solveNQueens(int n) {
        ArrayList<List<String>> res=new ArrayList<>();
        
        char[][] board=new char[n][n];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]='.';
            }
        }
        
        dfs(res, board, 0);
        
        return res;
    }
    
    private void dfs(ArrayList<List<String>> res, char[][] board, int level){
        if(level==board.length){
            res.add(constructSolution(board));
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
                if(board[i][j]=='Q' && (col==j || row+j ==col+i || row+col==i+j)){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private ArrayList<String> constructSolution(char[][] board){
        ArrayList<String> solution=new ArrayList<>();
        
        for(char[] row: board){
            solution.add(String.valueOf(row));
        }
        
        return solution;
    }
}