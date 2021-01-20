class Solution {
    public int findCircleNum(int[][] isConnected) {
        int res = 0;
        int  n = isConnected.length;
        
        boolean[] visited = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            
            dfs(i, visited, isConnected);
            res++;
        }
        
        return res;
    }
    
    public void dfs(int node, boolean[] visited, int[][] connected){
        if(visited[node]) return;
        
        visited[node] = true;
        
        for(int i=0;i<connected[node].length;i++){
            if(connected[node][i] == 1){
                dfs(i, visited, connected);
            }
        }
        
        return;
    }
}