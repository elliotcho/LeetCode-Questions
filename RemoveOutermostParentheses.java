class Solution {
    public String removeOuterParentheses(String S) {
        int counter=0; 
        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<S.length();i++){
            if(counter==0){
                counter++;
            }
            
            else if(counter==1 && S.charAt(i)==')'){
                counter--;
            }
            
            else{
                if(S.charAt(i)=='('){
                    res.append('(');
                    counter++;
                }
                
                else{
                    res.append(')');
                    counter--;
                }
            }
        }
        
        return res.toString();
    }
}
