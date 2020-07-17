class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] bucket = new int[256];
        
        for(char c: s.toCharArray()){
            if(bucket[c] > 0){
                bucket[c]--;
            }
            
            else{
                bucket[c]++;
            }
        }
        
        int count = 0;
        
        for(int i: bucket){
            if(i > 0){count++;}
        }
        
        return count == 0 || count == 1;
    }
}