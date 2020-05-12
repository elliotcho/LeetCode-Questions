class Solution {
    public int orangesRotting(int[][] grid) {
        LinkedList<int[]> queue=new LinkedList<>();
        
        int m=grid.length;
        int n=grid[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i, j});
                }
            }
        }
        
        int[][] directions={{1,0}, {-1,0}, {0,1}, {0, -1}};
        
        int level=0;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                int[] coordinate=queue.remove();
                
                for(int[] d: directions){
                    int nextInRow=coordinate[0]+d[0];
                    int nextInCol=coordinate[1]+d[1];
                    
                    if(nextInRow<0 || nextInCol<0 || nextInRow>=m || nextInCol>=n || grid[nextInRow][nextInCol]!=1){
                        continue;
                    }
                    
                    queue.add(new int[]{nextInRow, nextInCol});
                    
                    grid[nextInRow][nextInCol]=2;
                }
            }
            
            level++;
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){return -1;}
            }
        }
        
        return level==0? 0: level-1;
    }
}