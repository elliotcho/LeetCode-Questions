class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        
        backtrack(res, new ArrayList<>(), nums);
        
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> solution, int[] nums){
        if(solution.size()==nums.length){
            res.add(new ArrayList<>(solution));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(solution.contains(nums[i])){continue;}
            
            solution.add(nums[i]);
            
            backtrack(res, solution, nums);
            
            solution.remove(solution.size()-1);
        }
    }
}