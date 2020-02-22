class Solution {
    public boolean validMountainArray(int[] A) {
        int increasing=0;
        
        while(increasing+1<A.length && A[increasing]<A[increasing+1]){
            increasing++;
        }
        
        if(increasing==A.length-1 || increasing==0){
            return false;
        }
        
        while(increasing+1<A.length && A[increasing]>A[increasing+1]){
            increasing++;
        }
        
        return increasing==A.length-1;
    }
}