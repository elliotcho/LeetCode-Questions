class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int start=0, res=0;
        
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i-1]>=nums[i]){start=i;}
            res=Math.max(res, i-start+1);
        }
        
        return res;
    }
}