class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxHeap.add(nums[i]);
        }
        
        int subsequence=0;
        
        for(int i=0;i<nums.length;i++){
            res.add(maxHeap.poll()); 
            
            sum-=res.get(res.size()-1);
            subsequence+=res.get(res.size()-1);
            
            if(subsequence>sum){break;}
        }
        
        return res;
    }
}