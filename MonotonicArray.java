class Solution {
    public boolean isMonotonic(int[] A) {
        boolean increasing=true, decreasing=true;
        
        for(int i=1;i<A.length;i++){
            //elements are in ascending order
            if(A[i]>A[i-1]){decreasing=false;}
            
            //elements are in descending order
            if(A[i]<A[i-1]){increasing=false;}
            
            if(!(increasing || decreasing)){return false;}
        }
        
        return increasing || decreasing;
    }
}