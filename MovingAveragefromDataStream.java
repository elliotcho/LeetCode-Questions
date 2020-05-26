class MovingAverage {
    double sum;
    int maxSize;
    LinkedList<Integer> queue;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        sum=0;
        maxSize=size;
        queue=new LinkedList<>();
    }
    
    public double next(int val) {
        if(queue.size()==maxSize){
            sum-=queue.remove();
        }
        
        queue.add(val);
        sum+=val;
        
        return sum/queue.size();
    }
}
/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */