class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        
        backtrack(res, "", 0, 0, n);
        
        return res;
    }
    
    public void backtrack(List<String> res, String pair, int open, int close, int max){
        if(pair.length()==max*2){
            res.add(pair);        
            return;
        }
        
        if(open<max){backtrack(res, pair+"(", open+1, close, max);}
        if(close<open){backtrack(res, pair+")", open, close+1, max);}
    }
}