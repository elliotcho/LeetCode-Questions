class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int pushIdx=0;
        int popIdx=0;
        
        Stack<Integer> stack=new Stack<>();
        
        while(pushIdx<pushed.length && popIdx<popped.length){
            stack.push(pushed[pushIdx++]);
            
            while(!stack.isEmpty() && stack.peek() == popped[popIdx]){
                stack.pop();
                popIdx++;
            }
        }
        
        return stack.isEmpty();
    }
}