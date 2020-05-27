class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        ArrayList<Integer>[] adjList=new ArrayList[N+1];
        
        for(int i=1;i<=N;i++){
            adjList[i]=new ArrayList<>();
        }
        
        for(int[] dislike: dislikes){
            adjList[dislike[0]].add(dislike[1]);
            adjList[dislike[1]].add(dislike[0]);
        }
        
        int[] visited=new int[N+1];
        
        for(int i=1;i<=N;i++){
            if(visited[i]==0 && !(dfs(adjList, visited, i, 1))){
                return false;
            }
        }
        
        return true;
    }
    
    private boolean dfs(List<Integer>[] adjList, int[] visited, int node, int color){
        if(visited[node]!=0){
            return visited[node]==color;
        }
        
        visited[node]=color;
        
        for(int adj: adjList[node]){
            if(!dfs(adjList, visited, adj, -color)){
                return false;
            }
        }
        
        return true;
    }
}