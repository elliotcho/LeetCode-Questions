class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int curr = 0;
        
        for(char c: s.toCharArray()){
            if(c == '('){
                res = Math.max(++curr, res);
            } 
            
            if(c == ')'){
                curr--;
            }
        }
        
        return res;
    }
}