class Solution {
    public int minStartValue(int[] nums) {
        int lowest=0, sum=0;
        
        for(int i: nums){
            sum+=i;
            lowest=Math.min(lowest, sum);
        }
        
        return 1-lowest;
    }
}