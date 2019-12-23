class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack=new Stack<>();
        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<S.length();i++){
            if(!stack.isEmpty() && stack.peek()==S.charAt(i)){
                stack.pop(); 
                res.deleteCharAt(res.length()-1);
            }
            
            else{stack.push(S.charAt(i)); 
                 res.append(S.charAt(i));
            }
        }
           
        return res.toString();
    }
}