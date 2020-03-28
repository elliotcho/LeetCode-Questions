class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if(grid.length==0){return 0;}
        
        int res=0;
        
        int[] max_in_row=new int[grid.length];
        int[] max_in_col=new int[grid.length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                max_in_row[i]=Math.max(max_in_row[i], grid[i][j]);
                max_in_col[j]=Math.max(max_in_col[j], grid[i][j]);
            }
        }
        
        for(int i=0;i<max_in_row.length;i++){
            for(int j=0;j<max_in_col.length;j++){
                res+=Math.min(max_in_row[i], max_in_col[j])-grid[i][j];
            }
        }
        
        return res;
    }
}