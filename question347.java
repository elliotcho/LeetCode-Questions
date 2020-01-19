class Solution {
  public List<Integer> topKFrequent(int[] nums, int k) {
      HashMap<Integer, Integer> map=new HashMap<>();
      
      for(int i=0;i<nums.length;i++){
          if(map.containsKey(nums[i])){
              map.put(nums[i], map.get(nums[i])+1);
          }
          
          else{
              map.put(nums[i], 1);
          }
      }
      
      PriorityQueue<Map.Entry<Integer, Integer>> heap=
            new PriorityQueue<>((o1, o2) -> o2.getValue()-o1.getValue());
      heap.addAll(map.entrySet());
      
      ArrayList<Integer> res=new ArrayList<>();
      for(int i=0;i<k;i++){
          res.add((int)heap.poll().getKey());
      }
      
      return res;
  }
}