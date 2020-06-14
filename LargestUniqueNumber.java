class Solution {
    public int largestUniqueNumber(int[] A) {
        int res=-1;
        int[] bucket=new int[1001];
        
        for(int n: A){bucket[n]++;}
        
        for(int n=0;n<bucket.length;n++){
            if(bucket[n]==1){
                res=Math.max(res, n);
            }
        }
        
        return res;
    }
}