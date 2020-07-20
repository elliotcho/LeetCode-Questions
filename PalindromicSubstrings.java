class Solution {
    public int countSubstrings(String s) {
        int[] res = {0};
        
        for(int i=0;i<s.length();i++){
            expandMiddle(i, i, s, res);
            expandMiddle(i, i+1, s, res);
        }
        
        return res[0];
    }
    
    private void expandMiddle(int start, int end, String s, int[] res){
        while(start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)){
            res[0]++;
            start--;
            end++;
        }
        
        return;
    }
}