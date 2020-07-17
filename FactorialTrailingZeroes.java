class Solution {
    public int trailingZeroes(int n) {
        int numFives = 0;
        
        for(long i=5; i<=n; i*=5){
            numFives += n/i;
        }
        
        return numFives;
    }
}