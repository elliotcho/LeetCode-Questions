class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[] costs=new int[n];
        
        Arrays.fill(costs, Integer.MAX_VALUE);
        
        costs[src]=0;
        
        for(int i=0;i<=K;i++){
            int[] temp=costs.clone();
            
            for(int[] flight: flights){
                int currNode=flight[0];
                int adjNode=flight[1];
                int weight=flight[2];
                
                if(costs[currNode]==Integer.MAX_VALUE){continue;}
                
                temp[adjNode]=Math.min(temp[adjNode], costs[currNode]+weight);
            }
            
            costs=temp;
        }
        
        return costs[dst]!=Integer.MAX_VALUE? costs[dst]: -1;
    }
}