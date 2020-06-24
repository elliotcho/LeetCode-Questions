class Solution {
    public int[][] highFive(int[][] items) {
        HashMap<Integer, PriorityQueue<Integer>> map =new HashMap<>();
        
        for(int[] item: items){
            map.putIfAbsent(item[0], new PriorityQueue<>());
            
            map.get(item[0]).add(item[1]);
            
            if(map.get(item[0]).size()>5){
                map.get(item[0]).poll();
            }
        }
        
        int[][] res=new int[map.size()][2];
        
        int idx =0;
        
        for(Map.Entry<Integer, PriorityQueue<Integer>> entry: map.entrySet()){
            res[idx][0]=entry.getKey();
            
            PriorityQueue<Integer> pq =entry.getValue();
            
            while(!pq.isEmpty()){
                res[idx][1]+=pq.poll();
            }
            
            res[idx][1]/=5;
            
            idx++;
        }
        
        return res;
    }
}