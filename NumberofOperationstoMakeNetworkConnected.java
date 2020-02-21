class Solution {
    public int makeConnected(int n, int[][] connections) {
        int[] set=new int[n];
        
        int parts=0, extra=0;
        
        for(int i=0;i<set.length;i++){
            set[i]=i;
        }
        
        for(int[] edge: connections){
            int u=findParent(set, edge[0]);
            int v=findParent(set, edge[1]);
            
            if(u==v){extra++;}
            
            else{set[u]=v;}
        }
        
        for(int j=0;j<set.length;j++){
            if(set[j]==j){parts++;}
        }
        
        return extra>=parts-1? parts-1: -1;
    }
    
    public int findParent(int[] set, int node){
        if(set[node]!=node){
            set[node]=findParent(set, set[node]);
        }
        
        return set[node];
    }
}