class Solution {
    public int numRookCaptures(char[][] board) {
        if(board.length==0){return 0;}
        
        int res=0;
        
        int[][] directions={{0,1}, {0, -1}, {1, 0}, {-1, 0}};
        
        int m=board.length;
        int n=board[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='R'){
                    for(int[] d: directions){
                        int row=i;
                        int col=j;
                        
                        while(row>=0 && col>=0 && row<m && col<n){
                            if(board[row][col]=='p'){
                                res++;
                                break;
                            }  
                            
                            if(board[row][col]=='B'){
                                break;
                            }
                            
                            row+=d[0];
                            col+=d[1];
                        }
                    }
                    
                    break;
                }
            }
        }
        
        return res;
    }
}