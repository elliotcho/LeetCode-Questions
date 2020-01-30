class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup=new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){dup.add(nums[i]);}
        }
        
        return dup;
    }
}
