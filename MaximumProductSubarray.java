class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0){return 0;}
        
        int curr_max=nums[0];
        int curr_min=nums[0];
        int res=nums[0];
        
        for(int i=1;i<nums.length;i++){
            int temp=curr_max;
            
            curr_max=Math.max(Math.max(curr_max*nums[i], curr_min*nums[i]), nums[i]);
            curr_min=Math.min(Math.min(temp*nums[i], curr_min*nums[i]), nums[i]);
            
            res=Math.max(curr_max, res);
        }
        
        return res;
    }
}