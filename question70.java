class Solution {
    public int climbStairs(int n) {
        int[] table=new int[n+1];
        table[1]=1;

        if(n>=2){table[2]=2;}
        
        for(int i=3; i<=n;i++){
            table[i]=table[i-1]+table[i-2];
        }
        
        return table[n];
    }
}