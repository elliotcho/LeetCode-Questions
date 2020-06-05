class Solution {
    public String reverseWords(String s) {    
        StringBuilder res=new StringBuilder();
        
        String[] split=s.trim().split(" ");
        
        for(int i=split.length-1;i>=0;i--){
            res.append(split[i]+ " ");
        }
        
        res.deleteCharAt(res.length()-1);
        
        for(int i=0;i<res.length();i++){
            if(i>0 && res.charAt(i)==' ' && (res.charAt(i-1)==' ' || res.charAt(i-1)=='*')){
                res.setCharAt(i, '*');
            }
        }

        return res.toString().replaceAll("\\*", "");
    } 
}