class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character, String> map=new HashMap<>();
        
        ArrayList<String> rows=new ArrayList<>();
        rows.add("QWERTYUIOP"); 
        rows.add("ASDFGHJKL");
        rows.add("ZXCVBNM");
        
        for(String s: rows){
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                
                map.put(c, s);
                map.put(Character.toLowerCase(c), s);
            }
        }
        
        ArrayList<String> res=new ArrayList<>();
        for(String word: words){
            int flag=0;    
            String previous=map.get(word.charAt(0));
            
            for(int k=1;k<word.length();k++){
                char current=word.charAt(k);
                
                if(!map.get(current).equals(previous)){
                    flag=1;
                    break;
                }
            }
                   
            if(flag==0){res.add(word);}
        }
        
        return res.toArray(new String[res.size()]);
    }
}
