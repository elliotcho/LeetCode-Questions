class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int res = 0;
        int sum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for(int i = 0; i < A.length; i++){
            sum = (sum + A[i])%K;
            
            sum = (sum < 0)? sum + K: sum;
            
            res+= map.getOrDefault(sum, 0);
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return res;
    }
}