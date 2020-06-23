class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {    
        int res=0;
        
        int[] bucket=new int[128];
        
        int start=0;
        int end=0;
        
        int distinct=0;
        
        while(end<s.length()){
            if(bucket[s.charAt(end++)]++ == 0){distinct++;}
            
            while(distinct > k){
                if(--bucket[s.charAt(start++)] == 0){
                    distinct--;
                }
            }
            
            res=Math.max(end-start, res);
        }
        
        return res;
    }
}