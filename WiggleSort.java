class Solution {
    public void wiggleSort(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(i%2!=0 && nums[i]<nums[i-1]){
                swap(i-1, i, nums);
            }
            
            else if(i%2==0 && nums[i]>nums[i-1]){
                swap(i-1, i, nums);
            }
        }
        
        return;
    }
    
    private void swap(int i, int j, int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}