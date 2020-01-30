class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        int check=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){return i;}
            if(nums[i]>target){index=i; check=1; break;}
        }
        
        if(check==0){return nums.length;}
        else{
            return index;
        }
    }
}
