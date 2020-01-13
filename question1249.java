class Solution {
    public String minRemoveToMakeValid(String s) {
        int[] stack=new int[s.length()]; int top=-1;
        ArrayList<Integer> indices=new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)==')'){
                if(top==-1 && s.charAt(i)==')'){
                    top++; stack[top]=i;
                }
                
                else if(top!=-1 && s.charAt(i)==')'){
                    if(s.charAt(stack[top])==')'){
                        top++; stack[top]=i;
                    }
                    
                    else{top--;}
                }
                
                else{
                    top++; stack[top]=i;
                }
            }
        }
    
        for(int i=0;i<=top;i++){
            indices.add(stack[i]);
        }
        int index=0;
        
        StringBuilder res=new StringBuilder();
        
        for(int j=0;j<s.length();j++){
            if(index<indices.size() && j==indices.get(index)){
                index++;
                continue;
            }
            
            else{
                res.append(s.charAt(j));
            }
        }
        
        return res.toString();
    }
}