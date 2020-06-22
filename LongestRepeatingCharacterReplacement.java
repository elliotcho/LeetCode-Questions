class Solution {
    public int characterReplacement(String s, int k) {    
        int res=0;
        
        int[] bucket=new int[26];
        
        int left=0;
        int right=0;
        
        int maxFreq = 0;
        
        while(right<s.length()){
            bucket[s.charAt(right)-65]++; 
            
            maxFreq=Math.max(maxFreq, bucket[s.charAt(right)-65]);
            
            int conversionsNeeded = (right - left + 1) - maxFreq;
            
            if(conversionsNeeded > k){
                bucket[s.charAt(left)-65]--;
                left++;
            }
            
            res= Math.max(res, right-left+1);
                
            right++;
        }
        
        return res;
    }
}