class Solution {
    public List<List<String>> partition(String s) {
        ArrayList<List<String>> res=new ArrayList<>();
        
        bactrack(res, new ArrayList<>(), s, 0);
        
        return res;
    }
    
    private void bactrack (List<List<String>> res, List<String> solution, String s, int start){
        if(start==s.length()){
            res.add(new ArrayList(solution));
            return;
        }
        
        for(int i=start;i<s.length();i++){
            if(isPalindrome(s, start, i)){
                solution.add(s.substring(start, i+1));
                
                bactrack(res, solution, s, i+1);
                
                solution.remove(solution.size()-1);
            }
        }
    }
        
    private boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        
        return true;
    }
}