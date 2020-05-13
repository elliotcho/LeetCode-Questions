class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        
        if(matrix.length==0){return res;}
        
        int m=matrix.length;
        int n=matrix[0].length;
        
        boolean[][] pacific=new boolean[m][n];
        boolean[][] atlantic=new boolean[m][n];
        
        LinkedList<int[]> pQueue=new LinkedList<>();
        LinkedList<int[]> aQueue=new LinkedList<>();
        
        for(int i=0;i<m;i++){
            pQueue.add(new int[]{i, 0});
            aQueue.add(new int[]{i, n-1});
            
            pacific[i][0]=true;
            atlantic[i][n-1]=true;
        }
        
        for(int j=0;j<n;j++){
            pQueue.add(new int[]{0, j});
            aQueue.add(new int[]{m-1, j});
            
            pacific[0][j]=true;
            atlantic[m-1][j]=true;
        }
        
        bfs(pQueue, pacific, matrix, m, n);
        bfs(aQueue, atlantic, matrix, m, n);
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    ArrayList<Integer> temp=new ArrayList<>();
                    
                    temp.add(i);
                    temp.add(j);
                    
                    res.add(temp);
                }
            }
        }
        
        return res;
    }
    
    private void bfs(LinkedList<int[]> queue, boolean[][] possible, int[][] matrix, int m, int n){
        int[][] directions={{-1,0}, {1,0}, {0,-1}, {0,1}};
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                int[] point=queue.remove();
                
                for(int[] d: directions){
                    int nextInRow=point[0]+d[0];
                    int nextInCol=point[1]+d[1];
                    
                    if(nextInRow<0 || nextInCol<0 || nextInRow>=m || nextInCol>=n){
                        continue;
                    }
                    
                    if(possible[nextInRow][nextInCol] || matrix[point[0]][point[1]]>matrix[nextInRow][nextInCol]){
                        continue;
                    }
                    
                    possible[nextInRow][nextInCol]=true;
                    
                    queue.add(new int[]{nextInRow, nextInCol});
                }
            }
        }
    }
}