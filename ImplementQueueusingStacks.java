class MyQueue {
    Stack<Integer> mainStack=new Stack<>();
    Stack<Integer> tempStack=new Stack<>();
    
    /** Initialize your data structure here. */
    public MyQueue() {
        //nothing to initialize
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!mainStack.isEmpty()){
            tempStack.push(mainStack.pop());
        }    
        
        mainStack.push(x);
        
        while(!tempStack.isEmpty()){
            mainStack.push(tempStack.pop());
        }
        
        return;
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return mainStack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return mainStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return mainStack.isEmpty();
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */