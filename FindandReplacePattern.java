class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> res=new ArrayList<>();
        
        for(String word: words){
            if(match(word, pattern)){
                res.add(word);
            }
        }
        
        return res;
    }
    
    public boolean match(String S, String P){
        HashMap<Character, Character> sMap=new HashMap<>();
        HashMap<Character, Character> pMap=new HashMap<>();
        
        for(int i=0;i<S.length();i++){
            char s=S.charAt(i);
            char p=P.charAt(i);
            
            if(!sMap.containsKey(s)){sMap.put(s, p);}
            if(!pMap.containsKey(p)){pMap.put(p, s);}
            
            if(sMap.get(s)!=p || pMap.get(p)!=s){return false;}
        }
        
        return true;
    }
}