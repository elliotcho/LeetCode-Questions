class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res=Integer.MIN_VALUE;
        double sum=0;
        
        int start=0;
        
        for(int i=0;i<=nums.length;i++){
            if(i>=k){
                res=Math.max(res, sum/k); 
                sum-=nums[start++];
            }
            
            if(i==nums.length){break;}
            
            sum+=nums[i];
        }
        
        return res;
    }
}