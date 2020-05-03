class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i=1;i<10;i++){
            dfs(res, i, n);
        }
        
        return res;
    }
    
    private void dfs(List<Integer> res, int num, int bound){
        if(num>bound){return;}
        
        res.add(num);
        
        for(int i=0;i<10;i++){
            dfs(res, num*10+i, bound);
        }
    }
}