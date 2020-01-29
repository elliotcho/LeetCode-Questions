class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0){return 0;}
        
        int start=0, end=0, current=0, min=Integer.MAX_VALUE;
        
        while(end<nums.length){
            while(current<s && end<nums.length){
                current+=nums[end]; end++;
            }
            
            while(current>=s && start<nums.length){
                min=Math.min(end-start, min);
                current-=nums[start]; start++;
            }
        }
        
        if(min==Integer.MAX_VALUE){return 0;}
        else{return min;}
    }
}