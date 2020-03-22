class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adjList=new ArrayList[numCourses];
        
        for(int i=0;i<numCourses;i++){adjList[i]=new ArrayList<>();}
        
        for(int[] edge: prerequisites){adjList[edge[1]].add(edge[0]);}
        
        int[] visited=new int[numCourses];
        ArrayList<Integer> schedule=new ArrayList<>();
        
        for(int i=0;i<numCourses;i++){
            if(!dfs(adjList, visited, schedule, i)){return new int[0];}
        }
        
        return convert(schedule);
    }
    
    public boolean dfs(List<Integer>[] adjList, int[] visited, 
                       List<Integer> schedule, int node){
        
        if(visited[node]==2){return true;}
        if(visited[node]==1){return false;}
        
        if(visited[node]==0){
            visited[node]=1;
            
            for(int edge: adjList[node]){
                if(!dfs(adjList, visited, schedule, edge)){return false;}
            }
        }
        
        schedule.add(0, node);
        
        visited[node]=2;
        return true;
    }
    
    
    public int[] convert(ArrayList<Integer> schedule){
        int[] res=new int[schedule.size()];
        
        for(int i=0;i<res.length;i++){res[i]=schedule.get(i);}
        
        return res;
    }
}