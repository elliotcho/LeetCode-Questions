class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            
            else if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'){   
                if(stack.isEmpty()){
                    return false;
                }
                
                else if(stack.peek()=='(' && s.charAt(i)!=')'){return false;}
                else if(stack.peek()=='[' && s.charAt(i)!=']'){return false;}
                else if(stack.peek()=='{' && s.charAt(i)!='}'){return false;}
                
                else{
                    stack.pop();
                }
            }
        }
        
        return stack.isEmpty();
    }
}
