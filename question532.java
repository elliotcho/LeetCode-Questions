class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0){return 0;}
  
        HashSet<Integer> allNums=new HashSet<>();
        HashSet<Integer> pairs=new HashSet<>();
        
        for(int j=0;j<nums.length;j++){
            if(allNums.contains(nums[j]-k)){
                pairs.add(nums[j]-k);
            }
            
            if(allNums.contains(nums[j]+k)){
                pairs.add(nums[j]);
            }
            
            allNums.add(nums[j]);
        }
        
        return pairs.size();
    }
}
