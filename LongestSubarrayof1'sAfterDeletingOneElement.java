class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0;
        
        int start = 0;
        int end = 0;
        
        int zeroes = 0;
        
        while(end<nums.length){
            if(nums[end] == 0){
                zeroes++;
            }
            
            
            while(zeroes > 1){
                if(nums[start] == 0){
                    zeroes--;
                }
                
                start++;
            }
            
            res = Math.max(res, end - start);
            
            end++;
        }
        
        return res;
    }
}