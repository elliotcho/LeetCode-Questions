class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] mat=new int[n][m];
        
        int result=0;
        
        for(int[] arr: indices){
            for(int j=0;j<mat[0].length;j++){
                mat[arr[0]][j]+=1;
            }
            
            
            for(int i=0;i<mat.length;i++){
               mat[i][arr[1]]+=1; 
            }
        }
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]%2!=0){result++;}
            }
        }
        
        
        
        
        return result;
    }
}
