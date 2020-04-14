class Solution {
    public int longestIncreasingPath(int[][] matrix) {
       if(matrix.length==0){return 0;}
       
       int[][] memo=new int[matrix.length][matrix[0].length];
        
       int res=0;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                res=Math.max(res, dfs(i, j, matrix, memo, -1));
            }
        }
        
        return res;
    }
    
    public int dfs(int i, int j, int[][] matrix, int[][] memo, int prev){
        if(i<0 || j<0 || i>=matrix.length|| j>=matrix[i].length || matrix[i][j]<=prev){
            return 0;
        }
        
        if(memo[i][j]!=0){return memo[i][j];}
        
        int res=0;
        
        res=Math.max(res, dfs(i-1, j, matrix, memo, matrix[i][j]));
        res=Math.max(res, dfs(i+1, j, matrix, memo, matrix[i][j]));
        res=Math.max(res, dfs(i, j-1, matrix, memo, matrix[i][j]));
        res=Math.max(res, dfs(i, j+1, matrix, memo, matrix[i][j]));
        
        memo[i][j]=++res;
        
        return res;
    }
}