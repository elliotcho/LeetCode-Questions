class Solution {
    public boolean checkValidString(String s) {
       Stack<Integer> leftParenStack =new Stack<>();
       Stack<Integer> starStack =new Stack<>();
        
       for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
           
           if(c=='('){
               leftParenStack.push(i);
           }
           
           else if(c==')'){
               if(!leftParenStack.isEmpty()){
                   leftParenStack.pop();
               }
               
               else if(!starStack.isEmpty()){
                   starStack.pop();
               }
               
               else{
                   return false;
               }
           }
           
           else{
               starStack.push(i);
           }
        }
        
        while(!leftParenStack.isEmpty() && !starStack.isEmpty()){
            int pos=starStack.pop();
            
            if(pos>leftParenStack.peek()){
                leftParenStack.pop();
            }
        }
        
        return leftParenStack.isEmpty();
    }
}