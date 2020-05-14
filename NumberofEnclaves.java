class Solution {
    public int numEnclaves(int[][] A) {
        if(A.length==0){return 0;}
        
        int m=A.length;
        int n=A[0].length;
        
        for(int i=0;i<m;i++){
            if(A[i][0]==1){dfs(i, 0, A);}
            if(A[i][n-1]==1){dfs(i, n-1, A);}
        }
        
        for(int j=0;j<n;j++){
            if(A[0][j]==1){dfs(0, j, A);}
            if(A[m-1][j]==1){dfs(m-1, j, A);}
        }
        
        int res=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(A[i][j]==1){
                    res++;
                }
            }
        }
        
        return res;
    }
    
    private void dfs(int i, int j, int[][] A){
        if(i<0 || j<0 || i>=A.length || j>=A[i].length || A[i][j]!=1){
            return;
        }
        
        A[i][j]=0;
        
        dfs(i-1, j, A);
        dfs(i+1, j, A);
        dfs(i, j-1, A);
        dfs(i, j+1, A);
    }
}