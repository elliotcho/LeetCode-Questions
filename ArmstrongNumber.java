class Solution {
    public boolean isArmstrong(int N) {
        int original=N;
        int digits=0;
        
        while(N>0){
            N/=10;
            digits++;
        }
        
        int newNum=0;
        N=original;
        
        while(N>0){
            newNum+=Math.pow(N%10, digits);
            N/=10;
        }
        
        return newNum==original;
    }
}