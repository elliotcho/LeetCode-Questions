class Solution {
    public int calculate(String s) {
        int[] stack=new int[s.length()]; int top=-1;
        
        int currentNum=0; char sign='+';
                
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(Character.isDigit(c)){
                currentNum=10*currentNum+(int)(c-'0');
            }
            
            if((!Character.isDigit(c) && c!=' ') || i==s.length()-1){
                if(sign =='+'){
                    top++; stack[top]=currentNum;
                }
                
                else if(sign=='-'){
                    top++; stack[top]=currentNum*-1;
                }
                
                else if(sign=='*'){
                    currentNum=stack[top]*currentNum; 
                    top--;
                    top++; stack[top]=currentNum;
                }
                
                else if(sign=='/'){
                    currentNum=stack[top]/currentNum; 
                    top--;
                    top++; stack[top]=currentNum;
                }
                
                sign=c;
                currentNum=0;
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
