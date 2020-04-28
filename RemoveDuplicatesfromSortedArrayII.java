class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer=0;
        
        for(int i: nums){
            if(pointer<2 || nums[pointer-2]!=i){
                nums[pointer++]=i;
            }
        }
        
        return pointer;
    }
}