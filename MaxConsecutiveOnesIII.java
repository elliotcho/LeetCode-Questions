class Solution {
    public int longestOnes(int[] A, int K) {
        int i=0, conversions=0, max=0;
        
        for(int j=0;j<A.length;j++){
            if(A[j]==0){conversions++;}
            
            while(conversions>K){
                if(A[i]==0){conversions--;}
                i++;
            }
            
            max=Math.max(max, j-i+1);
        }
        
        return max;
    }
}
