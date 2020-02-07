class Solution {
    public int longestPalindrome(String s) {
        int[] bucket=new int[128];
        
        for(char c: s.toCharArray()){bucket[c]++;}
        
        int res=0;
        
        for(int i: bucket){
            res+=(i/2)*2;
            if(res%2==0 && i%2==1){res++;}
        }
        
        return res;
    }
}