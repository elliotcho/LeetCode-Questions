class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1){return 0;}
        
        int res=1;
        
        int left=0;
        int right=nums[0];
        
        while(left<=right){
            if(right>=nums.length-1){
                return res;
            }
            
            int maxReachableIdx=Integer.MIN_VALUE;
            
            for(;left<=right;left++){
                maxReachableIdx=Math.max(maxReachableIdx, left+nums[left]);
            }
            
            if(maxReachableIdx>right){
                left=right+1;
                right=maxReachableIdx;
                res++;
            }
        }
        
        return -1;
    }
}