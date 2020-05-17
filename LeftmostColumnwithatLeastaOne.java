/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int m=binaryMatrix.dimensions().get(0);
        int n=binaryMatrix.dimensions().get(1);
    
        int res=-1;
        int start=0;
        int end=n-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(colHasOne(binaryMatrix, mid, m)){
                end=mid-1;
                res=mid;
            }
            
            else{
                start=mid+1;
            }
        }
        
        return res;
    }
    
    private boolean colHasOne(BinaryMatrix binaryMatrix, int colNum, int m){
        for(int i=0;i<m;i++){
            if(binaryMatrix.get(i, colNum)==1){
                return true;
            }
        }
        
        return false;
    }
}