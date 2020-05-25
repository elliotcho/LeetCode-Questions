class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int[][] table=new int[A.length+1][B.length+1];
        
        for(int i=1;i<table.length;i++){
            for(int j=1;j<table[i].length;j++){
                if(A[i-1]==B[j-1]){
                    table[i][j]=1+table[i-1][j-1];
                }
                
                else{
                    table[i][j]=Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }
        
        return table[A.length][B.length];
    }
}