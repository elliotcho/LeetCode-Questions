class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String res="";
        int minLength=Integer.MAX_VALUE;
        int[] bucket=new int[26];
        
        for(char c: licensePlate.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
                bucket[c-97]++;
            }
        }
        
        for(String word: words){            
            if(checkMatch(bucket, word) && word.length()<minLength){
                minLength=word.length();
                res=word;
            }
        }
        
        return res;
    }
    
    private boolean checkMatch(int[] bucket, String word){
        int[] target=new int[26];
        
        for(char c: word.toCharArray()){
            target[c-97]++;
        }
        
        for(int i=0;i<26;i++){
            if(bucket[i]>0 && bucket[i]>target[i]){
                return false;
            }
        }
        
        return true;
    }
}