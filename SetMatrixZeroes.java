class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length==0){return;}
        
        boolean firstRowToZero=false;
        boolean firstColToZero=false;
        
        int m=matrix.length;
        int n=matrix[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                    
                    if(i==0){firstRowToZero=true;}
                    if(j==0){firstColToZero=true;}
                }
            }
        }
        
        for(int i=1;i<m;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<n;j++){
                    matrix[i][j]=0;
                }
            }
        }
        
        for(int j=1;j<n;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<m;i++){
                    matrix[i][j]=0;
                }
            }
        }
        
        if(firstRowToZero){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        
        if(firstColToZero){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
        
        return;
    }
}