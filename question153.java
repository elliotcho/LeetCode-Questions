class Solution {
    public int findMin(int[] nums) {
        int start=0, end=nums.length-1;
        
        while(start<=end && end>0){
            if(nums[start]<nums[end]){return nums[start];}
            
            int mid=(start+end)/2;
            int prev=(mid-1+nums.length)%nums.length, next=(mid+1)%nums.length;
            
            if(nums[prev]>nums[mid] && nums[next]>nums[mid]){return nums[mid];}
            
            else if(nums[mid]<nums[end]){end=mid-1;}
            else{start=mid+1;}
        }
        
        return nums[start];
    }
}