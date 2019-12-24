class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        int first=-1, last=-1;
        
        int start=0, end=nums.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                first=mid; end=mid-1;
            }
            else{
                if(nums[mid]<target){start=mid+1;}
                else if(nums[mid]>target){end=mid-1;}
            }     
        }
        
        start=0; end=nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                last=mid; start=mid+1;
            }
            else{
                if(nums[mid]<target){start=mid+1;}
                else if(nums[mid]>target){end=mid-1;}
            }     
        }
        
        res[0]=first; res[1]=last;
        
        return res;
    }
}