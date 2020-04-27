class Solution {
    public int getMaximumGold(int[][] grid) {
        if(grid.length==0){return 0;}
        
        int[] res={0};
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]!=0){
                    dfs(res,i, j, grid, 0);
                }
            }
        }
        
        return res[0];
    }
    
    private void dfs(int[] res, int i, int j, int[][] grid, int val){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]==0){
            res[0]=Math.max(res[0], val);
            return;
        }
        
        int temp=grid[i][j];
        grid[i][j]=0;
        
        dfs(res, i-1, j, grid, temp+val);
        dfs(res, i+1, j, grid, temp+val);
        dfs(res, i, j-1, grid, temp+val);
        dfs(res, i, j+1, grid, temp+val);
        
        grid[i][j]=temp;
    }
}