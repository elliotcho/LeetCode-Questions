class Solution {
    public int minKnightMoves(int x, int y) {
        x=Math.abs(x);
        y=Math.abs(y);
        
        int[][] directions={{1, 2}, {-1, 2}, {1, -2}, {-1,-2}, {2, 1}, {2, -1}, {-2, 1},{-2,-1}};
        
        LinkedList<int[]> queue =new LinkedList<>();
        queue.add(new int[]{0,0});
        
        HashSet<String> set=new HashSet<>();
        set.add("0,0");
        
        int res=0;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                int[] curr=queue.remove();
                
                if(x==curr[0] && y==curr[1]){
                    return res;
                }
                
                for(int[] d: directions){
                    int newRow=curr[0]+d[0];
                    int newCol=curr[1]+d[1];
                    
                    if(newRow<-1 || newCol<-1 || set.contains(newRow+"," +newCol)){
                        continue;
                    }
                    
                    set.add(newRow+","+newCol);
                    queue.add(new int[]{newRow, newCol});
                }
            }
            
            res++;
        }
        
        return -1;
    }
}