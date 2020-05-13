class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid.length==0 || grid[0][0]!=0){return -1;}
        
        int m=grid.length;
        int n=grid[0].length;
        
        boolean[][] visited=new boolean[m][n];
        int[][] directions={{-1,0}, {1,0}, {0,1}, {0,-1}, {-1, -1}, {1, 1}, {-1, 1}, {1, -1}};
        
        LinkedList<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0, 0});
        
        int level=1;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                int[] point=queue.remove();
                
                if(point[0]==m-1 && point[1]==n-1){
                    return level;
                }
                
                for(int[] d: directions){
                    int nextInRow=point[0]+d[0];
                    int nextInCol=point[1]+d[1];
                    
                    if(nextInRow<0 || nextInCol<0 || nextInRow>=m || nextInCol>=n){
                        continue;
                    }
                    
                    if(visited[nextInRow][nextInCol] || grid[nextInRow][nextInCol]==1){
                        continue;
                    }
                    
                    visited[nextInRow][nextInCol]=true;
                    
                    queue.add(new int[]{nextInRow, nextInCol});
                }
            }  
            
            level++;
        }
        
        return -1;
    }
}