class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int count=0;
        int lastZero=-1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            
            else{
                count=i-lastZero;
                lastZero=i;
            }
            
            res=Math.max(res, count);
        }
        
        return res;
    }
}