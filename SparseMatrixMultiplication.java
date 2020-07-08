class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        int rowsInA = A.length;
        int colsInA = A[0].length;
        int colsInB = B[0].length;
        
        int[][] res = new int[rowsInA][colsInB];
        
        for(int i=0;i<rowsInA;i++){
            for(int j=0;j<colsInA;j++){
                if(A[i][j] != 0){
                    for(int k=0;k<colsInB;k++){
                        res[i][k] += A[i][j] * B[j][k];
                    }
                }
            }
        }
        
        return res;
    }
}