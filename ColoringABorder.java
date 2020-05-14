class Solution {
    public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
       if(grid.length==0 || grid[r0][c0]==color){return grid;}
        
       dfs(r0, c0, grid, grid[r0][c0]);
        
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[i].length;j++){
               if(grid[i][j]<0){
                   grid[i][j]=color;
               }
           }
       }
        
        return grid;
    }
    
    private void dfs(int i, int j, int[][] grid, int oldColor){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]!=oldColor){
            return;
        }
        
        grid[i][j]=-oldColor;
        
        dfs(i-1, j, grid, oldColor);
        dfs(i+1, j, grid, oldColor);
        dfs(i, j-1, grid, oldColor);
        dfs(i, j+1, grid, oldColor);
        
        if(i>0 && j>0 && i<grid.length-1 && j<grid[i].length-1
            && oldColor==Math.abs(grid[i-1][j])
            && oldColor==Math.abs(grid[i+1][j])
            && oldColor==Math.abs(grid[i][j-1])
            && oldColor==Math.abs(grid[i][j+1])
          ){
            grid[i][j]=oldColor;
        }
    }
}