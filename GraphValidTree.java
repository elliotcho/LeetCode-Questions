class Solution {
    public boolean validTree(int n, int[][] edges) {
        int[] parent =new int[n];
        
        Arrays.fill(parent, -1);
        
        for(int[] edge: edges){
            int u = find(parent, edge[0]);
            int v =find(parent, edge[1]);
            
            if(u==v){
                return false;
            }
            
            parent[u]=v;
        }
        
        return edges.length == n-1;
    }
    
    private int find(int[] parent, int node){
        if(parent[node]==-1){
            return node;
        }
        
        return find(parent, parent[node]);
    }
}