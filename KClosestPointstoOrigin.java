class Solution {
    public int[][] kClosest(int[][] points, int K) {
       PriorityQueue<int[]> heap=
           new PriorityQueue<>((a1, a2)-> (a2[0]*a2[0]+a2[1]*a2[1])-(a1[0]*a1[0]+a1[1]*a1[1]));
       
       for(int[] point: points){
           heap.add(point);
           
           if(heap.size()>K){
               heap.poll();
           }
       }
        
       int[][] res=new int[K][2];
        
       while(heap.size()!=0){
           res[--K]=heap.poll();
       } 
        
       return res; 
    }
}