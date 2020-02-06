class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        
        reverse(0, nums.length-1, nums);
        
        reverse(0, k-1, nums);
        
        reverse(k, nums.length-1, nums);
    }
    
    public void reverse(int start, int end, int[] nums){
        while(start<end){
            swap(start, end , nums);
            start++; 
            end--;
        }
    }
    
    public void swap(int i, int j, int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}