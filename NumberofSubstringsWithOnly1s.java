class Solution {
    public int numSub(String s) {
        int res = 0;
        int count = 0;
        int mod = (int) (1e9 + 7);
        
        for(char c: s.toCharArray()){
            if(c == '0'){
                count = 0;
            }
            
            else{
                count = count + 1;
            }
            
            res = (res+count)%mod;
        }
        
        return res;
    }
}