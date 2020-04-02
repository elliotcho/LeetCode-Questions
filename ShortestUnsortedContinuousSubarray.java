class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        boolean sorted=true;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                sorted=false;
            }
            
            if(!sorted){
                min=Math.min(min, nums[i]);
            }
        }
        
        sorted=true;
        
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i]<nums[i-1]){
                sorted=false;
            }
            
            if(!sorted){
                max=Math.max(max, nums[i-1]);
            }
        }
        
        int start=0, end=0;
        
        for(start=0;start<nums.length;start++){
            if(min<nums[start]){break;}
        }
        
        for(end=nums.length-1;end>=0;end--){
            if(max>nums[end]){break;}
        }
        
        return end-start < 0? 0: end-start+1;
    }
}