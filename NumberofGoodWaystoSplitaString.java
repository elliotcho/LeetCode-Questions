class Solution {
    public int numSplits(String s) {
        int res = 0;
        
        int[] leftBucket = new int[26];
        int[] rightBucket = new int[26];
        
        int uniqueOnLeft = 0;
        int uniqueOnRight = 0;
        
        for(char c: s.toCharArray()){
            if(rightBucket[c-'a'] == 0){
                uniqueOnRight++;
            }
            
            rightBucket[c-'a']++;
        }
        
        for(char c: s.toCharArray()){
            if(leftBucket[c-'a'] == 0){
                uniqueOnLeft++;
            }
            
            if(rightBucket[c-'a'] == 1){
                uniqueOnRight--;
            }
            
            leftBucket[c-'a']++;
            rightBucket[c-'a']--;
            
            if(uniqueOnLeft == uniqueOnRight){
                res++;
            }
        }
        
        return res;
    }
}