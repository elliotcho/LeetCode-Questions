class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        
        int res=0;
        
        for(int i=nums.length-1;i>=2;i--){
            int start=0, end=i-1;
            
            while(start<end){
                if(nums[start]+nums[end]>nums[i]){
                    res+=end-start;
                    end--;
                }   
                
                else{
                    start++;
                }
            }
        }
        
        return res;
    }
}