class Solution {
    public int countLetters(String S) {
        int curr=1;
        int res=1;
        
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)==S.charAt(i-1)){
                curr++;
            }
            
            else{
                curr=1;
            }
            
            res+=curr;
        }
        
        return res;
    }
}