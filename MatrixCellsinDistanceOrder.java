class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R*C][2];
        
        boolean[][] visited = new boolean[R][C];
        
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r0, c0});
        
        int i = 0;
        
        while(!queue.isEmpty()){
            int[] curr = queue.remove();
            
            int row = curr[0];
            int col = curr[1];
            
            if(row<0 || row>=R || col<0 || col>=C || visited[row][col]){
                continue;
            }
            
            visited[row][col] = true;
            
            res[i] = curr;
            i++;
         
            queue.add(new int[]{row, col-1});
            queue.add(new int[]{row, col+1});
            queue.add(new int[]{row-1, col});
            queue.add(new int[]{row+1, col});
        }
        
        return res;
    }
}