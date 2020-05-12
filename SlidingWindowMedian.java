class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        if(nums.length==0){return new double[0];}
        
        double[] res=new double[nums.length-k+1];
        MedianFinder mf=new MedianFinder();
        
        for(int i=0;i<nums.length;i++){
            mf.add((long) nums[i]);
            
            if(i>=k-1){
                res[i-k+1]=mf.findMedian();
                mf.remove((long) nums[i-k+1]);
            }
        }
        
        return res;
    }
    
    class MedianFinder{
        PriorityQueue<Long> maxHeap;
        PriorityQueue<Long> minHeap;
        
        public MedianFinder(){
            maxHeap=new PriorityQueue<>(Collections.reverseOrder());
            minHeap=new PriorityQueue<>();
        }
        
        private void add(long num){
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
            
            if(maxHeap.size()<minHeap.size()){
                maxHeap.add(minHeap.poll());
            }
        }
        
        private void remove(long num){
            if(num<=findMedian()){
                maxHeap.remove(num);
            }
            
            else{
                minHeap.remove(num);
            }
            
            if(maxHeap.size()<minHeap.size()){
                maxHeap.add(minHeap.poll());
            }   
            
            if(maxHeap.size()-minHeap.size()>1){
                minHeap.add(maxHeap.poll());
            }
        }
        
        private double findMedian(){
            if(maxHeap.size()==minHeap.size()){
                return (double) (maxHeap.peek() + minHeap.peek())/2;
            }
            
            return maxHeap.peek();
        }
    }
}