class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int totalSum=0;
        
        int currSum=Integer.MIN_VALUE;
        int maxSum=Integer.MIN_VALUE;
        
        for(int i: A){
            totalSum+=i;
            
            if(currSum<0){currSum=i;}
            else{currSum+=i;}
            
            maxSum=Math.max(maxSum, currSum);
        }
        
        currSum=Integer.MAX_VALUE;
        int minSum=Integer.MAX_VALUE;
        
        for(int i: A){
            if(currSum>0){currSum=i;}
            else{currSum+=i;}
            
            minSum=Math.min(currSum, minSum);
        }
        
        return maxSum<0? maxSum: Math.max(maxSum, totalSum-minSum);
    }
}