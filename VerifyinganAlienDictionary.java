class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] bucket=new int[26];
        
        for(int i=0;i<order.length();i++){bucket[order.charAt(i)-97]=i;}
        
        for(int i=1;i<words.length;i++){
            if(!isSorted(words[i-1], words[i], bucket)){return false;}
        }
        
        return true;
    }
    
    public boolean isSorted(String word1, String word2, int[] bucket){
        int i=0, j=0;
        
        while(i<word1.length() && j<word2.length()){
            char c1=word1.charAt(i++), c2=word2.charAt(j++);
            
            if(c1!=c2){return bucket[c1-97]-bucket[c2-97]<0;}
        }
        
        return word1.length()<word2.length();
    }
}