class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res=0;
        int count=0;
        
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0, 1);
        
        for(int i: nums){
            if(i%2!=0){count++;}
            
            if(map.containsKey(count-k)){res+=map.get(count-k);}
            
            map.put(count, map.getOrDefault(count, 0)+1);
        }
        
        return res;
    }
}