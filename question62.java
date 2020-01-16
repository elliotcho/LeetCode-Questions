class Solution {
    public int uniquePaths(int m, int n) {
        int[][] table=new int[m][n];
        
        for(int a=0;a<table.length;a++){
            table[a][0]=1;
        }
        
        for(int b=0;b<table[0].length;b++){
            table[0][b]=1;
        }
        
        for(int i=1;i<table.length;i++){
            for(int j=1;j<table[0].length;j++){
                table[i][j]=table[i-1][j]+table[i][j-1];
            }
        }
        
        return table[m-1][n-1];
    }
}