class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adjList=new ArrayList[numCourses];
        
        for(int i=0;i<numCourses;i++){
            adjList[i]=new ArrayList<>();
        }
        
        for(int[] edge: prerequisites){
            adjList[edge[1]].add(edge[0]);
        }
        
        int[] visited=new int[numCourses];
        
        for(int i=0;i<numCourses;i++){
            if(!dfs(adjList, visited, i)){return false;}
        }
        
        return true;
    }
    
    public boolean dfs(ArrayList<Integer>[] adjList, int[] visited, int node){
        if(visited[node]==2){return true;}
        if(visited[node]==1){return false;}
        
        if(visited[node]==0){
            visited[node]=1;
            
            for(int edge: adjList[node]){
                if(!dfs(adjList, visited, edge)){return false;}
            }
        }
        
        visited[node]=2;
        return true;
    }
}