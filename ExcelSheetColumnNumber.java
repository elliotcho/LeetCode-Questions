class Solution {
    public int titleToNumber(String s) {
        int res=0;
        
        for(char c: s.toCharArray()){
            res=res*26+(int)(c-64);
        }
        
        return res;
    }
}