public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        
        String s=Integer.toBinaryString(n);
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                res++;
            }
        }
        
        return res;
    }
}