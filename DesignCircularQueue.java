class MyCircularQueue {
    int[] queue;
    
    int front=-1, rear=-1;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queue=new int[k];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){return false;}
        
        else if(front==-1 && rear==-1){
            front++;
            rear++;
            queue[rear]=value;
        }
        
        else{
            queue[++rear%queue.length]=value;
        }
        
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){return false;}
        
        else if(front==rear){
            front=-1;
            rear=-1;
        }
        
        else{
            front=(front+1)%(queue.length);
        }
        
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        return front==-1? front: queue[front%queue.length];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        return rear==-1? rear: queue[rear%queue.length];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front==-1 && rear==-1;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (rear+1)%queue.length==(front%queue.length);
    }
}
/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */