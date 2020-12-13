class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        
        int[] map = new int[26];
        
        for(char c: allowed.toCharArray()){
            map[c - 'a']++;
        }
        
        for(String w: words){
            boolean match = true;
            
            for(char c: w.toCharArray()){
                if(map[c - 'a'] == 0){
                    match = false;
                    break;
                }    
            }
            
            if(match) res++;
        }
        
        return res;
    }
}