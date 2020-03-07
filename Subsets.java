class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        
        generate(0, nums, res, new ArrayList<>());
        
        return res;
    }
    
    public void generate(int index, int[] nums, List<List<Integer>> res, List<Integer> current){
        res.add(new ArrayList<>(current));
        
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            
            generate(i+1, nums, res, current);
            
            current.remove(current.size()-1);
        }
    }
}