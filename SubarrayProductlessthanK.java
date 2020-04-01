class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){return 0;}
        
        int prod=1;
        int res=0;
        
        int left=0;
        int right=0;
        
        while(right<nums.length){
            prod*=nums[right];
            
            while(left<nums.length && prod>=k){
                prod/=nums[left++];
            }
            
            res+=right-left+1;
            
            right++;
        }
        
        return res;
    }
}