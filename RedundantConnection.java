class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] set=new int[edges.length+1];
        
        for(int[] edge: edges){
            int u=findParent(set, edge[0]);
            int v=findParent(set, edge[1]);
            
            if(u==v){return edge;}
            
            set[u]=v;
        }
        
        throw new IllegalArgumentException("Cycle not found");
    }
    
    public int findParent(int[] set, int node){
        if(set[node]==0){
            return node;
        }
        
        return set[node]==node? set[node]: findParent(set, set[node]);
    }
}