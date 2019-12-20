class Solution {
    public int[] sortArrayByParityII(int[] A) {
   
        int[] res= new int[A.length];
        int eI=0, oI=1;
        
        
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){res[eI]=A[i]; eI+=2;}
            else{res[oI]=A[i]; oI+=2;}
        }
        
        return res;
    }
}