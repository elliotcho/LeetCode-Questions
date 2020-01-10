class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] table=new int[s.length()+1];
        return helpBreak(s, wordDict, table);
    }
    
    public boolean helpBreak(String s, List<String> dict, int[] table){
        if(s.length()==0){return true;}    
        
        if(table[s.length()]==0){
            table[s.length()]=-1;
            
           for(int i=1;i<=s.length();i++){
                if(dict.contains(s.substring(0,i))&&
                  helpBreak(s.substring(i), dict, table)){
                    return true;
                }
           }  
        }
        
        return false;
    }
}