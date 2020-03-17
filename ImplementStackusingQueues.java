class MyStack {
    Queue<Integer> mainQueue=new LinkedList<>();
    Queue<Integer> tempQueue=new LinkedList<>();
    
    /** Initialize your data structure here. */
    public MyStack() {
        //nothing to initialize 
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        while(!mainQueue.isEmpty()){
            tempQueue.add(mainQueue.remove());
        }
        
        mainQueue.add(x);
        
        while(!tempQueue.isEmpty()){
            mainQueue.add(tempQueue.remove());
        }
        
        return;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return mainQueue.remove();
    }
    
    /** Get the top element. */
    public int top() {
        return mainQueue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return mainQueue.size()==0;
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */