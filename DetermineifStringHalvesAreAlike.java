class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length() / 2;
        
        int res = 0;
        
        for(int i=0;i<n;i++){
            if(isVowel(s.charAt(i))){
                res++;
            }
        }
        
        for(int i=n;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                res--;
            }
        }
        
        return res == 0;
    }
    
    public boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}