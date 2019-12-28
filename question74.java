class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){return false;}
        
        int top=0, left=0, right=matrix[0].length-1;
        
        while(left<=right){
            if(matrix[top][right]<target){
                if(top<matrix.length-1){top++;}
                else{return false;}
            }
            
            else{
                int mid=(left+right)/2;
                
                //do a binary search on the row
                if(matrix[top][mid]==target){return true;}
                else if(matrix[top][mid]>target){right=mid-1;}
                else{left=mid+1;}
            }
        }
        
        return false;
    }
}