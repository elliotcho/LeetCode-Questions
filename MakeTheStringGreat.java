class Solution {
    public String makeGood(String s) {
        StringBuilder res = new StringBuilder();
        
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(c - stack.peek()) == 32){
                stack.pop();
            }
            
            else{
                stack.push(c);
            }
        }
        
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        
        return res.reverse().toString();
    }
}