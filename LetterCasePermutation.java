class Solution {
    public List<String> letterCasePermutation(String S) {
        ArrayList<String> res=new ArrayList<>();
        
        backtrack(res, S.toCharArray(), 0);
        
        return res;
    }
    
    private void backtrack(List<String> res, char[] S, int start){
        res.add(String.valueOf(S));
        
        for(int i=start;i<S.length;i++){
            if(!Character.isLetter(S[i])){continue;}
            
            char lower=Character.toLowerCase(S[i]);
            char upper= Character.toUpperCase(S[i]);
            
            S[i] = Character.isLowerCase(S[i])? upper: lower;
            
            backtrack(res, S, i+1);
            
            S[i] = Character.isLowerCase(S[i])? upper: lower;
        }
    }
}
