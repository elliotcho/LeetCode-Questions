class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq=
            new PriorityQueue<>((o1, o2) -> o1.getValue()-o2.getValue());
        
        pq.addAll(map.entrySet());
        
        while(k>0){
            k-=(int) pq.poll().getValue();
        }
        
        return k<0 ? pq.size() + 1: pq.size();
    }
}