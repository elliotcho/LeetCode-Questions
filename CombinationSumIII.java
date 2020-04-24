class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        
        backtrack(res, new ArrayList<>(), k, n, 1);
        
        return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> solution, int k, int n, int start){
        if(n<0){return;}
        
        if(solution.size()==k){
            if(n==0){
                res.add(new ArrayList(solution));
            }
            
            return;
        }
        
        for(int i=start;i<=9;i++){
            solution.add(i);
            
            backtrack(res, solution, k, n-i, i+1);
            
            solution.remove(solution.size()-1);
        }
    }
}