class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack=new int[tokens.length]; int top=-1;
        
        ArrayList<String> oper=new ArrayList<>(); 
        oper.add("+"); oper.add("-"); 
        oper.add("*"); oper.add("/");
        
        
        for(int i=0;i<tokens.length;i++){
            if(!oper.contains(tokens[i])){
                top++;
                stack[top]=Integer.valueOf(tokens[i]);
            }
            
            else{
                int i2=stack[top]; top--;
                int i1=stack[top]; top--;
                
                top++;
                stack[top]=doOp(tokens[i], i1, i2);
            }
        }
        
        
        return stack[top];
    }
    
    public int doOp(String oper, int i1, int i2){
        int res=0;
        
        if(oper.equals("+")){
            res=i1+i2;
        }
        
        else if(oper.equals("-")){
            res=i1-i2;
        }
        
        else if(oper.equals("*")){
            res=i1*i2;
        }
        
        else if(oper.equals("/")){
            res=i1/i2;
        }
        
        return res;
    }
}
