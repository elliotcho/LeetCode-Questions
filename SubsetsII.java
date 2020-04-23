class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        
        Arrays.sort(nums);
        
        backtrack(res, new ArrayList<>(), nums, 0);
        
        return res;
    }
    
    private void backtrack(ArrayList<List<Integer>> res, ArrayList<Integer> solution, int[] nums, int start){
        res.add(new ArrayList(solution));
        
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){continue;}
            
            solution.add(nums[i]);
            
            backtrack(res, solution, nums, i+1);
            
            solution.remove(solution.size()-1);
        }
    }
}