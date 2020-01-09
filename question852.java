class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int res=-1; int index=0;
        
        for(int i=0;i<A.length;i++){
            if(A[i]>res){
                res=A[i];
                index=i;
            }
        }
        
        return index;
    }
}