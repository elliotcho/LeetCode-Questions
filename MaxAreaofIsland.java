class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        
	for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    int temp=0;
                    max=Math.max(max, dfs(grid, i, j, temp));
                }
            }
        }
        
        return max;
    }
    
    public int dfs(int[][] grid, int i, int j, int temp){
        if(i>grid.length-1 || j>grid[0].length-1
          || i<0 || j<0 || grid[i][j]!=1){
            return 0;
        }
        
        grid[i][j]=0;
        temp++;
        
        temp+=dfs(grid, i-1, j, 0);
        temp+=dfs(grid, i+1, j, 0);
        temp+=dfs(grid, i, j-1, 0);
        temp+=dfs(grid, i, j+1,0);
      
        return temp;
    }
}
