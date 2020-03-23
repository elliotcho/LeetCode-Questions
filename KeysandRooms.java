class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] visited=new int[rooms.size()];
        
        dfs(rooms, visited, 0);
        
        for(int i: visited){if(i!=2){return false;}}
        
        return true;
    }
    
    public void dfs(List<List<Integer>> rooms, int[] visited, int node){
        if(visited[node]==2 || visited[node]==1){return;}
        
        visited[node]=1;
        
        for(int i: rooms.get(node)){dfs(rooms, visited, i);}
        
        visited[node]=2;
        
        return;
    }
}