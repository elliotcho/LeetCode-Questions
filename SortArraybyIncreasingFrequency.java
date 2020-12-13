class Solution {
    public int[] frequencySort(int[] nums) {
        int[] res = new int[nums.length];
        int idx = 0;
        
        int[] map = new int[201];
        
        for(int i: nums){
            map[i + 100]++;
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (e1, e2) -> e2[1] == e1[1] ? e2[0] - e1[0] : e1[1] - e2[1]
        );
        
        for(int i: nums){
            if(map[i + 100] > 0){
                pq.add(new int[]{i , map[i + 100]});
                map[i + 100] = 0;
            }
        }
        
        while(!pq.isEmpty()){
            int[] entry = pq.poll();
            int n = entry[1];
            
            for(int i=0;i<n;i++){
                res[idx++] = entry[0];
            }
        }
        
        return res;
    }
}