class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = 1000000;
        
        while(start<end){
            int mid = (start+end)/2, sum = 0;
            
            for(int n: nums){
                sum+= (int) Math.ceil((double) n/mid);
            }
            
            if(sum > threshold){
                start = mid + 1;
            }
            
            else{
                end = mid;
            }
        }
        
        return start;
    }
}