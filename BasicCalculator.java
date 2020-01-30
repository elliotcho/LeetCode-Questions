class Solution {
    public int calculate(String s) {
        int[] stack=new int[s.length()]; int top=-1;
        
        int res=0, currentNum=0, sign=1;
       
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
        
            if(Character.isDigit(c)){
                currentNum=10*currentNum+(int)(c-'0');
            }
            
            else if(c=='+'){
                res+=sign*currentNum;
                currentNum=0;
                sign=1;
            }
            
            else if(c=='-'){
                res+=sign*currentNum;
                currentNum=0;
                sign=-1;
            }
            
            else if(c=='('){
                top++; stack[top]=res;
                top++; stack[top]=sign;
                res=0;
                sign=1;
            }
            
            else if(c==')'){
                res+=sign*currentNum;
                res*=stack[top]; top--;
                res+=stack[top]; top--;
                currentNum=0;
            }
        }
        
        if(currentNum!=0){
            res+=sign*currentNum;
        }
        
        return res;
    }
}
