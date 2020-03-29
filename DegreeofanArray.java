class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> count=new HashMap<>();
        HashMap<Integer, Integer> first_index=new HashMap<>();
        
        int degree=0;
        int res=0;
        
        for(int i=0;i<nums.length;i++){
            first_index.put(nums[i], first_index.getOrDefault(nums[i], i));
            
            count.put(nums[i], count.getOrDefault(nums[i], 0)+1);
            
            if(count.get(nums[i])>degree){
                degree=count.get(nums[i]);
                res=i-first_index.get(nums[i])+1;
            }
            
            else if(count.get(nums[i])==degree){
                res=Math.min(res, i-first_index.get(nums[i])+1);    
            }
        }
        
        return res;
    }
}