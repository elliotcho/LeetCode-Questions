class Solution {
    public int closedIsland(int[][] grid) {
        if(grid.length==0){return 0;}
        
        int res=0;
        
        for(int i=0;i<grid.length;i++){dfs(i, 0, grid);}
        for(int i=0;i<grid.length;i++){dfs(i, grid[i].length-1, grid);}
        for(int j=0;j<grid[0].length;j++){dfs(0, j, grid);}
        for(int j=0;j<grid[0].length;j++){dfs(grid.length-1, j, grid);}
        
        for(int i=1;i<grid.length-1;i++){
            for(int j=1;j<grid[i].length-1;j++){
                if(grid[i][j]==0){
                    res++;
                    dfs(i, j, grid);
                }
            }
        }
        
        return res;
    }
    
    public void dfs(int i, int j, int[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]==1){
            return;
        }
        
        grid[i][j]=1;
        
        dfs(i-1, j, grid);
        dfs(i+1, j, grid);
        dfs(i, j-1, grid);
        dfs(i, j+1, grid);
        
        return;
    }
}