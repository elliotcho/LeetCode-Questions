class Solution {
    public int bitwiseComplement(int N) {
        if(N==0){return 1;}
        
        int allOnes=0;
        int exponent=0;
        
        while(allOnes<N){
            allOnes += (int) Math.pow(2, exponent++);
        }
        
        return allOnes-N;
    }
}