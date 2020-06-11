class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        
        int idx=0;
        int start=0;
        
        while(idx<nums.length){
            res[idx++]=nums[start++];
            res[idx++]=nums[n++];
        }
        
        return res;
    }
}