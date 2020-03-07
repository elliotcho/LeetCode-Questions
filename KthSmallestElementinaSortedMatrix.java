class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int[] row: matrix){
            for(int val: row){
                heap.add(val);
                
                if(heap.size()>k){heap.poll();}
            }
        }
        
        return heap.poll();
    }
}