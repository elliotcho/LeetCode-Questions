class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] split=sentence.split(" ");
        
        for(int i=0;i<split.length;i++){
            int start=0;
            
            while(start<split[i].length() && start<searchWord.length()){
                if(split[i].charAt(start)!= searchWord.charAt(start)){
                    break;
                }
                
                start++;
            }
            
            if(start==searchWord.length()){
                return i+1;
            }
        }
        
        return -1;
    }
}