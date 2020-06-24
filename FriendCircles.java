class Solution {
    public int findCircleNum(int[][] M) {
        int res=0;
    
        boolean[] visited=new boolean[M.length];
        
        for(int i=0;i<M.length;i++){
            if(visited[i]){continue;}
            
            dfs(i, M, visited);
            
            res++;
        }
        
        return res;
    }
    
    private void dfs(int i, int[][] M,  boolean[] visited){
        if(visited[i]){
            return;
        }
        
        visited[i]=true;
        
        for(int j=0;j<M[i].length;j++){
            if(M[i][j]==1){
                dfs(j, M, visited);
            }
        }
    }
}