class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        int res=0;
        
        for(String s: ops){
            if(s.equals("C")){
                res=res-stack.pop();
            }
            
            else if(s.equals("D")){
                res+=stack.peek()*2;
                stack.push(stack.peek()*2);
            }
            
            else if(s.equals("+")){
                int temp1=stack.pop();
                int temp2=stack.pop();
                stack.push(temp2); stack.push(temp1);
                stack.push(temp1+temp2);
                res+=temp1+temp2;
            }
            
            else{
              stack.push(Integer.valueOf(s));
              res+=Integer.valueOf(s);
            }
        }
               
        return res;
    }
}