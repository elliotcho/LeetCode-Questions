class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){nums[i]=Integer.MAX_VALUE;}
        }
        
        for(int j=0;j<nums.length;j++){
            int val=Math.abs(nums[j])-1;
            
            if(val<nums.length && nums[val]>0){
                nums[val]*=-1;
            }
        }
        
        for(int k=0;k<nums.length;k++){
            if(nums[k]>0){return k+1;}
        }
        
        return nums.length+1;
    }
}