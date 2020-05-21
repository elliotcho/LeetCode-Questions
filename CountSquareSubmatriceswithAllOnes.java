class Solution {
    public int countSquares(int[][] matrix) {
        if(matrix.length==0){return 0;}
        
        int m=matrix.length;
        int n=matrix[0].length;
        
        int[][] table=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    table[i][j]=1;
                    
                    if(i>0 && j>0){
                        table[i][j]+=Math.min(table[i-1][j], Math.min(table[i][j-1], table[i-1][j-1]));
                    }
                }
            }
        }
        
        int res=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res+=table[i][j];
            }
        }
        
        return res;
    }
}