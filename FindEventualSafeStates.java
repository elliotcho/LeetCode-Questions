class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int[] colors = new int[graph.length];
        
        for(int i=0;i<graph.length;i++){
            if(dfs(i, graph, colors)){
                res.add(i);
            }
        }
        
        return res;
    }
    
    private boolean dfs(int node, int[][] graph, int[] colors){
        if(colors[node] != 0){
            return colors[node] == 1;
        }
        
        colors[node] = 2;
        
        for(int adj: graph[node]){
            if(!dfs(adj, graph, colors)){
                return false;
            }
        }
        
        colors[node] = 1;
        
        return true;
    }
}