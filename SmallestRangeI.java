class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min=A[0], max=A[0];
        
        for(int i: A){
            min=Math.min(min, i);
            max=Math.max(max, i);
        }
        
        min=min+K;
        max=max-K;
        
        return min>=max? 0: max-min;
    }
}