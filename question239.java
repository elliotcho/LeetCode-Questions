class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0){return new int[0];}
        
        LinkedList<Integer> queue=new LinkedList<>();
        int[] res=new int[nums.length-k+1];
        
        for(int i=0;i<nums.length;i++){
            if(queue.size()!=0 && queue.getFirst()<i-k+1){
                queue.remove();
            }
            while(queue.size()!=0 && nums[i]>nums[queue.getLast()]){
                queue.pollLast();
            }
            
            queue.add(i);
            
            if(i-k+1>=0){
                res[i-k+1]=nums[queue.getFirst()];
            }
        }
        
        return res;
    }
}