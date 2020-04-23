class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        
        Arrays.sort(candidates);

        backtrack(res, new ArrayList<>(), candidates, target, 0);
        
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> solution, int[] arr, int target, int start){
        if(target<0){return;}
        
        else if(target==0){
            res.add(new ArrayList(solution));
            return;
        }
        
        else{
            for(int i=start;i<arr.length;i++){
                solution.add(arr[i]);
            
                backtrack(res, solution, arr, target-arr[i], i);
            
                solution.remove(solution.size()-1);
            }
        }
    }
}