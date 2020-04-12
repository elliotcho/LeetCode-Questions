class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedWords=new HashSet<>();
        HashMap<String, Integer> map=new HashMap<>();
        
        for(String b: banned){
            bannedWords.add(b);
        }
        
        String[] split=paragraph.split(" ");
        
        for(String s: split){
            int endOfWord=0;
            
            for(char c: s.toCharArray()){
                if(isLetter(c)){
                    endOfWord++;
                }
                
                else{
                    break;
                }
            }
            
            String word=s.substring(0, endOfWord).toLowerCase();
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        
        String res="";
        int max=-1;
        
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue()>max && !bannedWords.contains(entry.getKey())){
                max=entry.getValue();
                res=entry.getKey();
            }
        }
        
        return res;
    }
    
    public boolean isLetter(char c){
        return c!='!' && 
               c!='?' && 
               c!='\''&& 
               c!=',' && 
               c!=';' &&
               c!='.';
    }
}