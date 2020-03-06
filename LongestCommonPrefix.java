class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){return "";}
        
        StringBuilder res=new StringBuilder();
        
        int pos=0;
        
        for(char c: strs[0].toCharArray()){
            for(int i=1;i<strs.length;i++){
                if(pos>=strs[i].length() || strs[i].charAt(pos)!=c){
                    return res.toString();
                }    
            }
            
            res.append(c);
            pos++;
        }
        
        return res.toString();
    }
}