class Solution {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        int m=maze.length;
        int n=maze[0].length;
        
        int[][] directions={{0,1}, {1,0}, {0,-1}, {-1,0}};
        
        boolean[][] visited=new boolean[m][n];
        visited[start[0]][start[1]]=true;
        
        LinkedList<int[]> queue =new LinkedList<>();
        queue.add(start);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                int[] curr=queue.remove();
                
                if(curr[0]==destination[0] && curr[1]==destination[1]){
                    return true;
                }
                
                for(int[] d: directions){
                    int row=curr[0];
                    int col=curr[1];
                    
                    int newRow=row+d[0];
                    int newCol=col+d[1];
                
                    while(newRow>=0 && newRow<m && newCol>=0 && newCol<n && maze[newRow][newCol]!=1){
                        row=newRow;
                        col=newCol;
                        
                        newRow+=d[0];
                        newCol+=d[1];
                    }
                    
                    if((row==curr[0] && col==curr[1]) || visited[row][col]){
                        continue;
                    }
                    
                    visited[row][col]=true;
                    
                    queue.add(new int[]{row, col});
                }
            }
        }
        
        return false;
    }
}