class Solution {
    public boolean canJump(int[] nums){
        int res=0;
        
        for(int i=0;i<nums.length;i++){
            if(i>res){
                return false;
            }
            
            res=Math.max(res, nums[i]+i);
        }
        
        return true;
    }
}