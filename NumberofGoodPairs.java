class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        
        int[] bucket = new int[101];
        
        for(int i: nums){
            res += bucket[i]++;
        }
        
        return res;
    }
}