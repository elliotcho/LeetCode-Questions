class MinStack {
    Stack<Integer> dataStack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {
        //nothing to initialize here
    }
    
    public void push(int x) {
        dataStack.push(x);
        
        if(minStack.isEmpty() || x<=minStack.peek()){
            minStack.push(x);
        }
    }
    
    public void pop() {
        if((int) dataStack.pop()==minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */