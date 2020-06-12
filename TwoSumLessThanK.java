class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        
        int start=0;
        int end=A.length-1;
        
        int res=-1;
        
        while(start<end){
            int sum=A[start]+A[end];
            
            if(sum<K){
                res=Math.max(res, sum);
                start++;
            }
            
            else{
                end--;
            }
        }
        
        return res;
    }
}