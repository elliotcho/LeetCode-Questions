class MedianFinder {
    //lower contains smaller elements of the stream and can provide its maximum in O(1) time
    //upper contains larger elements of the stream and can provide its minimum in O(1) time
    
    PriorityQueue<Integer> lower;
    PriorityQueue<Integer> upper;

    /** initialize your data structure here. */
    public MedianFinder() {
        lower=new PriorityQueue<>(Collections.reverseOrder());
        upper=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        lower.add(num);
        upper.add(lower.poll());
        
        if(lower.size()<upper.size()){
            lower.add(upper.poll());
        }
    }
    
    public double findMedian() {
        if(lower.size()==upper.size()){
            return (double)(upper.peek() + lower.peek())/2;
        }
        
        else{
            return lower.peek();
        }
    }
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */