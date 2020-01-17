class Solution {
    public String reverseWords(String s) {
        String res="";
        StringBuilder temp=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(i!=s.length()-1 && s.charAt(i)==' '){
                res+=temp.reverse().toString()+" "; 
                temp=new StringBuilder();
            }
            
            else{
                temp.append(s.charAt(i));
            }
        }
        res+=temp.reverse().toString();
        
        
        return res;
    }
}