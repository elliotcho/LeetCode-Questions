class Solution {
    public int[] sortArrayByParity(int[] A) {
        int mark=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                int temp=A[mark];
                A[mark]=A[i];
                A[i]=temp;
                mark++;
            }
            
            
        }
        
        return A;
    }
}
