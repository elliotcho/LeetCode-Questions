class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        
        Arrays.sort(nums);    
        
        backtrack(res, new ArrayList<>(), nums, new boolean[nums.length]);
        
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> solution, int[] nums, boolean[] used){
        if(solution.size()==nums.length){
            res.add(new ArrayList(solution));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(used[i] || (i>0 && nums[i]==nums[i-1] && !used[i-1])){continue;}
            
            solution.add(nums[i]);
            used[i]=true;
            
            backtrack(res, solution, nums, used);
        
            solution.remove(solution.size()-1);
            used[i]=false;
        }
    }
}