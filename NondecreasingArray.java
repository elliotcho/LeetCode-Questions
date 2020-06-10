class Solution {
    public boolean checkPossibility(int[] nums) {
        int conversions=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                conversions++;
                
                if(i-2<0 || nums[i-2]<=nums[i]){
                    nums[i-1]=nums[i];
                }
                
                else{
                    nums[i]=nums[i-1];
                }
            }
        }
        
        return conversions<=1;
    }
}