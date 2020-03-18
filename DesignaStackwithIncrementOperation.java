class CustomStack {
    int[] stack;
    int top=-1;

    public CustomStack(int maxSize) {
        stack=new int[maxSize];
    }
    
    public void push(int x) {
        if(top<stack.length-1){stack[++top]=x;}
    }
    
    public int pop() {  
        if(top==-1){return top;}
        
        int res=stack[top];
        
        top--;
        
        return res;
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<Math.min(k, stack.length);i++){
            stack[i]+=val;
        }
    }
}
/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */