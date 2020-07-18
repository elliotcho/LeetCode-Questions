class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int sum = 0;
        
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            
            sum = (k!=0) ? sum%k: sum;
            
            if(map.containsKey(sum) && i - map.get(sum) > 1){
                return true;
            }
            
            else{
                map.put(sum, i);
            }
        }
        
        return false;
    }
}