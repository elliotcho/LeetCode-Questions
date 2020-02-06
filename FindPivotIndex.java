class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        
        for(int i: nums){total+=i;}
        
        int left=0;
        
        for(int j=0;j<nums.length;j++){
            if(j!=0){left+=nums[j-1];}
            if(total-left-nums[j]==left){return j;}
        }
        
        return -1;
    }
}