class Solution {
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int m=maze.length;
        int n=maze[0].length;
        
        int[][] distance=new int[m][n];
        
        int[][] directions={{0,1}, {0,-1}, {1,0}, {-1,0}};
        
        LinkedList<int[]> queue=new LinkedList<>();
        queue.add(start);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                int[] curr=queue.remove();
                
                for(int[] d: directions){
                    int moves=distance[curr[0]][curr[1]];
                    
                    int row=curr[0];
                    int col=curr[1];
                            
                    int newRow=row+d[0];
                    int newCol=col+d[1];
                    
                    while(newRow>=0 && newCol>=0 && newRow<m && newCol<n && maze[newRow][newCol]!=1){
                        row=newRow;
                        col=newCol;
                        
                        newRow+=d[0];
                        newCol+=d[1];
                        
                        moves++;
                    }
                    
                    if(distance[row][col]==0 && row==start[0] && col==start[1]){
                        continue;
                    }
                    
                    if((distance[row][col]!=0 && distance[row][col]<=moves) || (row==curr[0] && col==curr[1])){
                        continue;
                    }
                    
                    distance[row][col]=moves;
                    
                    queue.add(new int[]{row, col});
                }
            }
        }
        
        int res=distance[destination[0]][destination[1]];
        
        return res==0? -1: res;
    }
}