class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];
        
        for(int i=0;i<graph.length;i++){
            if(colors[i] !=0){continue;}
            
            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(i);
            
            colors[i] = 1;
            
            while(!queue.isEmpty()){
                int curr = queue.remove();
                
                for(int adj: graph[curr]){
                    if(colors[adj] == colors[curr]){
                        return false;
                    }
                    
                    else if(colors[adj] == 0){
                        colors[adj] = -colors[curr];
                        queue.add(adj);
                    }
                }
            }
        }
        
        return true;
    }
}