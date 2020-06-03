class Solution {
    public int maxDistance(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
  
        boolean[][] visited=new boolean[m][n];
        int[][] directions={{1,0}, {-1, 0}, {0, 1}, {0, -1}};
        
        LinkedList<int[]> queue=new LinkedList<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    queue.add(new int[]{i, j});
                    visited[i][j]=true;
                }
            }
        }
        
        int res=-1;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                int[] curr=queue.remove();
                
                for(int[] d: directions){
                    int newRow=curr[0]+d[0];
                    int newCol=curr[1]+d[1];
                    
                    if(newRow<0 || newCol<0 || newRow>=m || newCol>=n || visited[newRow][newCol]){
                        continue;
                    }
                    
                    visited[newRow][newCol]=true;
                    
                    queue.add(new int[]{newRow,newCol});
                }
            }
            
            res++;
        }
        
        return res==0? -1: res; 
    }
}
