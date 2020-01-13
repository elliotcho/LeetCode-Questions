class Solution {
    public int scoreOfParentheses(String S) {
        int[] stack=new int[S.length()]; int top=-1;
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                top++; stack[top]=0;
            }
            
            else{
                int current=0;
                
                while(stack[top]!=0){
                    current+=stack[top];
                    top--;
                }
                top--;
                
                if(current==0){
                    top++; stack[top]=1;
                }
                
                else{
                    top++; stack[top]=current*2;
                }
            }
        }
        
        int res=0;
        while(top!=-1){
            res+=stack[top];
            top--;
        }
        
        return res;
    }
}