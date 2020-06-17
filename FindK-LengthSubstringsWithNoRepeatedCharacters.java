class Solution {
    public int numKLenSubstrNoRepeats(String S, int K) {
        int res=0;
        HashSet<Character> set=new HashSet<>();
            
        int start=0;
        int end=0;
        
        while(end<S.length()){
            while(set.contains(S.charAt(end))){
                set.remove(S.charAt(start++));
            }   
            
            set.add(S.charAt(end++));
            
            res+= (end-start >= K)? 1 : 0;
        }
        
        return res;
    }
}