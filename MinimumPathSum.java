class Solution {
    public int minPathSum(int[][] grid) {
        int[][] table=new int[grid.length][grid[0].length];
        
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[0].length;j++){
                table[i][j]=grid[i][j];
                
                if(i>0 && j==0){
                    table[i][j]+=table[i-1][0];
                }
                
                if(i==0 && j>0){
                    table[i][j]+=table[0][j-1];
                }
                
                if(i>0 && j>0){
                    table[i][j]+=Math.min(table[i-1][j], table[i][j-1]);   
                }
            }
        }
        
        return table[grid.length-1][grid[0].length-1];
    }
}
