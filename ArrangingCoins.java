class Solution {
    public int arrangeCoins(int n) {
        int res=0;
        
        int k=1;
        
        while(n>0){
            n-=k;
        
            k++;
            res++;
        }
        
        return n==0? res: res-1;
    }
}