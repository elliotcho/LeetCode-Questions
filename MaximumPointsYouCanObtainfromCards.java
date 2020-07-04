class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int res=0;
        int n=cardPoints.length;
        int total=0;
        
        for(int i=n-1;i>=n-k;i--){
            total+=cardPoints[i];
        }
        
        res=total;
        
        for(int i=n-k;i<n;i++){
            total-=cardPoints[i];
            
            total+=cardPoints[i-n+k];
            
            res=Math.max(res, total);
        }
        
        return res;
    }
}