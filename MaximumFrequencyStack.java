class FreqStack {
    HashMap<Integer, Integer> numCount=new HashMap<>();
    HashMap<Integer, Stack<Integer>> freqStack=new HashMap<>();
    int max=0;

    public FreqStack() {
        //nothing to initialize
    }
    
    public void push(int x) {
        numCount.put(x, numCount.getOrDefault(x, 0)+1);
        
        int freq=numCount.get(x);
        
        max=Math.max(max, freq);
        
        if(!freqStack.containsKey(freq)){freqStack.put(freq, new Stack<Integer>());}
        
        freqStack.get(freq).push(x);
    }
    
    public int pop() {
       int res=freqStack.get(max).pop();
        
       numCount.put(res, max-1);
        
       if(freqStack.get(max).size()==0){max--;}
        
       return res;
    }
}
/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */