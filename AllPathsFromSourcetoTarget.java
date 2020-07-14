class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        
        ArrayList<Integer> path = new ArrayList<>();
        path.add(0);
        
        dfs(0, res, path, graph);
        
        return res;
    }
    
    private void dfs(int node, List<List<Integer>> res, List<Integer> path, int[][] graph){
        if(node == graph.length-1){
            res.add(new ArrayList(path));
            return;
        }
        
        for(int adj: graph[node]){
            path.add(adj);
            
            dfs(adj, res, path, graph);
            
            path.remove(path.size()-1);
        }
    }
}