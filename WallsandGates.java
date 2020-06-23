class Solution {
    public void wallsAndGates(int[][] rooms) {
        if(rooms.length==0){return;}
        
        LinkedList<int[]> queue = new LinkedList<>();
        
        int m=rooms.length;
        int n=rooms[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rooms[i][j]==0){
                    queue.add(new int[]{i, j});
                }
            }    
        }
        
        int[][] directions ={{-1, 0}, {1,0}, {0, 1}, {0, -1}};
        
        while(!queue.isEmpty()){
            int[] curr = queue.remove();
            
            for(int[] d: directions){
                int newRow=curr[0]+d[0];
                int newCol=curr[1]+d[1];
                
                if(newRow<0 || newCol<0 || newRow>=m || newCol>=n || rooms[newRow][newCol]!=Integer.MAX_VALUE){
                    continue;
                }
                
                rooms[newRow][newCol]=rooms[curr[0]][curr[1]]+1;
                
                queue.add(new int[]{newRow, newCol});
            }
        }
    }
}