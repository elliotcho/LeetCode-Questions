class Solution {
    public int[] decompressRLElist(int[] nums) {
        int resArraySize=0;
        int resArrayIdx=0;
        
        for(int i=0;i<nums.length;i+=2){resArraySize+=nums[i];}
        
        int[] res=new int[resArraySize];
        
        for(int i=0;i<nums.length;i+=2){
            while(nums[i]>0){
                res[resArrayIdx++]=nums[i+1];
                nums[i]--;
            }
        }
        
        return res;
    }
}