class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder()); 
        
        for(int i: stones){
            heap.add(i);
        }
        
        while(heap.size()!=1){
            int stone1=heap.poll();
            int stone2=heap.poll();
            
            heap.add(stone1-stone2);
        }
        
        return heap.poll();
    }
}