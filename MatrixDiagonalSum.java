class Solution {
    public int diagonalSum(int[][] mat) {
        int res = 0;
        
        int m = mat.length;
        int n = mat[0].length;
        
        int row = 0;
        int col = 0;
        
        while(row < m && col < n){
            res += mat[row][col];
            
            mat[row][col] = 0;
            
            row++;
            col++;
        }
        
        row = 0;
        col = n - 1;
        
        while(row < m && col >= 0){
            res+= mat[row++][col--];
        }
        
        return res;
    }
}