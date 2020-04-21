class Solution {
    public int findLHS(int[] nums) {
        int res=0;
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key=entry.getKey();
        
            if(map.containsKey(key-1)){
                res=Math.max(res, map.get(key)+map.get(key-1));
            }
        }
        
        return res;
    }
}