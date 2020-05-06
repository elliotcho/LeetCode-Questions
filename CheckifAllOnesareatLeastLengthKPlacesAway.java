class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                count++;
            }
            
            else if(i==0){
                continue;
            }
            
            else{
                if(count<k){
                    return false;
                }
                
                count=0;
            }
        }
        
        return true;
    }
}