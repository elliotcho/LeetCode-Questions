class Solution {
    public String removeVowels(String S) {
        StringBuilder res=new StringBuilder();
        
        for(char c: S.toCharArray()){
            if(!isVowel(c)){
                res.append(c);
            }
        }
        
        return res.toString();
    }
    
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}