class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){return false;}
        
        int x=0, y=matrix[0].length-1;
        
        while(x<matrix.length && y>=0){
            if(matrix[x][y]==target){return true;}
            
            else if(target>matrix[x][y]){x++;}
            
            else if(target<matrix[x][y]){y--;}
        }
        
        return false;
    }
}