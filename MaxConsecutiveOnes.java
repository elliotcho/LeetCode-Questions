class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0, count=0;
        
        if(nums[0]==1){count=1;}
        if(nums.length==1){return nums[0];}
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            
            else{
                res=Math.max(count, res);
                count=0;
            }
        }
        
        return Math.max(res, count);        
    }
}
