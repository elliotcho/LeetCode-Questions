class Solution {
    public int binaryGap(int N) {
        int distance=Integer.MIN_VALUE, res=0;
        
        while(N!=0){
            if(N%2==1){
                res=Math.max(res, distance);
                distance=0;
            }
            
            N=N/2;
            
            distance++;
        }
        
        return res;
    }
}