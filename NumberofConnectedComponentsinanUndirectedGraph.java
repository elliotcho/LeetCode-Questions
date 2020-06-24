class Solution {
    public int countComponents(int n, int[][] edges) {
        LinkedList<Integer>[] adjList = new LinkedList[n];
        
        for(int i=0;i<n;i++){
            adjList[i]=new LinkedList<>();
        }
        
        for(int[] edge: edges){
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }
        
        int res=0;
        
        boolean[] visited = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(visited[i]){continue;}
            
            dfs(i, adjList, visited);
            
            res++;
        }
        
        return res;
    }
    
    private void dfs(int node, LinkedList<Integer>[] adjList, boolean[] visited){
        if(visited[node]){
            return;
        }
        
        visited[node]=true;
        
        for(int neighbor: adjList[node]){
            dfs(neighbor, adjList, visited);
        }
    }
}