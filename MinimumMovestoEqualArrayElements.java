class Solution {
    public int minMoves(int[] nums) {
        int res=0;
        int minVal=nums[0];
        
        for(int n: nums){
            minVal=Math.min(minVal, n);
        }
        
        for(int n: nums){
            res+=n-minVal;
        }
        
        return res;
    }
}