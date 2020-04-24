class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        
        backtrack(res, new ArrayList<>(), n, k, 1);
        
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> solution, int n, int k, int start){
        if(solution.size()==k){
            res.add(new ArrayList(solution));
            return;
        }
        
        for(int i=start;i<=n;i++){
            solution.add(i);
            
            backtrack(res, solution, n, k, i+1);
            
            solution.remove(solution.size()-1);
        }
    }
}