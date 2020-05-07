class Solution {
    public int arrayNesting(int[] nums) {
        int res=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                int start=i;
                int path=0;
                
                while(nums[start]!=-1){
                    int prev=start;
                    
                    start=nums[start];
                    path++;
                    
                    nums[prev]=-1;
                }
                
                res=Math.max(res, path);
            }
        }
        
        return res;
    }
}