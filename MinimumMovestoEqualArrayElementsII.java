class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        
        int res=0;
        
        int start=0;
        int end=nums.length-1;
        
        while(start<end){
            res+=nums[end--]-nums[start++];
        }
        
        return res;
    }
}