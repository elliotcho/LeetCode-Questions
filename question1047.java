class Solution {
    public String removeDuplicates(String S) {
        char[] stack=new char[S.length()];
        int top=-1;
            
        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<S.length();i++){
            if(top!=-1 && stack[top]==S.charAt(i)){
                top--;
                res.deleteCharAt(res.length()-1);
            }
            
            else{
                 stack[++top]=S.charAt(i); 
                 res.append(S.charAt(i));
            }
        }
           
        return res.toString();
    }
}
