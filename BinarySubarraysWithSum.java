class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int res = 0;
        int sum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for(int i: A){
            sum+=i;
            
            if(sum>=S && map.containsKey(sum - S)){
                res+= map.get(sum-S);
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return res;
    }
}