class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
               stack.push(res);
               res=new StringBuilder();
            }
            
            else if(s.charAt(i)==')'){
                res=res.reverse();
                
                String prepend=stack.pop().toString();
                
                for(int j=prepend.length()-1;j>=0;j--){
                    res.insert(0,prepend.charAt(j));
                }
            }
                  
            else{
                res.append(s.charAt(i));
            } 
        }
     
        return res.toString();
    }
}
