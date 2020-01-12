class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map=new HashMap<>();
        ArrayList<String> seen=new ArrayList<>();
        
        String[] words=str.split(" ");
        if(words.length!=pattern.length()){return false;}
        
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!words[i].equals(map.get(pattern.charAt(i)))){
                    return false;
                }
            }
            
            else{
                map.put(pattern.charAt(i), words[i]);
                
                if(!seen.contains(words[i])){seen.add(words[i]);}
               
                else{return false;}
            }
        }
        
        return true;
    }
}