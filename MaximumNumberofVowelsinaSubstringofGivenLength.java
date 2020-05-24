class Solution {
    public int maxVowels(String s, int k) {
        int start=0;
        int end=0;
        
        int vowels=0;
        int res=0;
        
        while(end<s.length()){
            if(isVowel(s.charAt(end++))){
                vowels++;
            }
            
            if(end-start==k){    
                res=Math.max(res, vowels);
                
                if(isVowel(s.charAt(start++))){
                    vowels--;
                }
            }
        }
        
        return res;
    }
    
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}