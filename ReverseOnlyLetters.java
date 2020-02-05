class Solution {
    public String reverseOnlyLetters(String S) {
        StringBuilder res=new StringBuilder();
        
        int end=S.length()-1;
        
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            
            if(Character.isLetter(c)){
               while(!Character.isLetter(S.charAt(end))){end--;}
               
               res.append(S.charAt(end));
               
               end--;
            }
            
            else{
                res.append(c);
            }
        }
        
        return res.toString();
    }
}