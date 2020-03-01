class Solution {
    public int hammingDistance(int x, int y) {
        int res=0;
        
        while(x!=0 || y!=0){
            int xDigit=x%2;
            int yDigit=y%2;
            
            if(xDigit!=yDigit){res++;}
            
            x/=2;
            y/=2;
        }
        
        return res;
    }
}