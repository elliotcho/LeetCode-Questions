class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        
        HashSet<String> set=new HashSet<>();
        
        StringBuilder res=new StringBuilder();
        
        for(String word: words){
            if(word.length()==1 || set.contains(word.substring(0, word.length()-1))){
                if(res.length()<word.length()){
                    res=new StringBuilder(word);
                }
                
                set.add(word);
            }
        }
        
        return res.toString();
    }
}