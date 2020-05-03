class Solution {
    HashMap<Integer, LinkedList<Integer>> map;

    public Solution(int[] nums) {
        map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i], new LinkedList<>());
            map.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        LinkedList<Integer> idxList=map.get(target);
        
        Random randomGenerator=new Random();
  
        int randIdx=randomGenerator.nextInt(idxList.size());
        
        return idxList.get(randIdx);
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */