class Solution {
    int[] original;
    int[] copy;
    Random randomGenerator;

    public Solution(int[] nums) {
        original=nums;
        
        copy=new int[original.length];
        
        reset();
        
        randomGenerator=new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        for(int i=0;i<copy.length;i++){
            copy[i]=original[i];
        }
        
        return copy;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=0;i<copy.length;i++){
            swap(i, randomGenerator.nextInt(copy.length));
        }
        
        return copy;
    }
    
    private void swap(int i, int j){
        int temp=copy[i];
        copy[i]=copy[j];
        copy[j]=temp;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */