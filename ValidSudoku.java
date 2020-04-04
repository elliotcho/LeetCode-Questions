class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='.'){continue;}
                
                String inRow=board[i][j]+"in row"+i;
                String inCol=board[i][j]+"in col"+j;
                String inBox=board[i][j]+"in box"+(i/3)+"," +(j/3);
                
                if(set.contains(inRow)|| set.contains(inCol) ||set.contains(inBox)){
                    return false;    
                }
                
                else{
                    set.add(inRow);
                    set.add(inCol);
                    set.add(inBox);
                }
            }
        }
        
        return true;
    }
}