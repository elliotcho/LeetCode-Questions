class Solution {
    public int minAddToMakeValid(String S) {
        char[] stack=new char[S.length()];
        int top=-1; int res=0;
        
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            
            if(c=='('){top++; stack[top]=c; res++;}
            else if(c==')' && top!=-1){top--; res--;}
            else if(c==')' && top==-1){res++;}
        }
        
        return res;
    }
}