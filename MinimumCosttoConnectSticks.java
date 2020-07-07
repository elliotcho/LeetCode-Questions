class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int stick: sticks){
            pq.add(stick);
        }
        
        int res = 0;
        
        while(pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();
            
            res+=x+y;
            
            pq.add(x+y);
        }
        
        return res;
    }
}