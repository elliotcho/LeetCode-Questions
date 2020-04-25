class Solution {
    public int countArrangement(int N) {
        int[] res={0};
        
        dfs(res, N, N, new boolean[N+1]);
        
        return res[0];
    }
    
    private void dfs(int[] res, int N, int pos, boolean[] visited){
        if(pos==0){
            res[0]++;
            return;
        }
        
        for(int i=1;i<=N;i++){
            if(!visited[i] && (i%pos==0 || pos%i==0)){
                visited[i]=true;
                
                dfs(res, N, pos-1, visited);
                
                visited[i]=false;
            }
        }
    }
}