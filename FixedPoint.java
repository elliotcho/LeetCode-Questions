class Solution {
    public int fixedPoint(int[] A) {
        int res=-1;
        
        int start=0;
        int end=A.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(mid==A[mid]){
                res=mid;
                end=mid-1;
            }
            
            else if(mid<A[mid]){
                end=mid-1;
            }
            
            else{
                start=mid+1;
            }
        }
        
        return res;
    }
}