class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] bucket=new int[100001];
        
        for(int i=0;i<B.length;i++){
            bucket[B[i]]=i;
        }
                   
        for(int i=0;i<A.length;i++){
            A[i]=bucket[A[i]];
        }
                   
        return A;
    }
}