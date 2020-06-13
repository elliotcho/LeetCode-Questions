class Solution {
    public int maximumMinimumPath(int[][] A) {
        int m=A.length;
        int n=A[0].length;
        
        boolean[][] visited=new boolean[m][n];
        visited[0][0]=true;
        
        int[][] directions={{0,1}, {0, -1}, {1, 0}, {-1, 0}};
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[2]-a[2]);
        pq.add(new int[]{0, 0, A[0][0]});
        
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            
            int row=curr[0];
            int col=curr[1];
            
            if(row==m-1 && col==n-1){
                return curr[2];
            }
            
            for(int[] d: directions){
                int newRow=row+d[0];
                int newCol=col+d[1];
                
                if(newRow<0 || newCol<0 || newRow>=m || newCol>=n || visited[newRow][newCol]){
                    continue;
                }
                
                visited[newRow][newCol]=true;
                
                pq.add(new int[]{newRow, newCol, Math.min(curr[2], A[newRow][newCol])});
            }
        }
        
        return -1;
    }
}