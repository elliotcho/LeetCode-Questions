class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int[] rowDirections={-1, 1, 0, 0};
        int[] colDirections={0, 0, -1, 1};
        
        LinkedList<Integer> rowQueue=new LinkedList<>();
        LinkedList<Integer> colQueue=new LinkedList<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    rowQueue.add(i);
                    colQueue.add(j);
                }
                
                else{
                    matrix[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        
        while(rowQueue.size()!=0 && colQueue.size()!=0){
            int currRow=rowQueue.remove();
            int currCol=colQueue.remove();
            int currVal=matrix[currRow][currCol];
            
            for(int i=0;i<4;i++){
                int row=currRow+rowDirections[i];
                int col=currCol+colDirections[i];
                
                if(row>=0 && row<matrix.length && col>=0 && col<matrix[0].length && matrix[row][col]>currVal+1){
                    matrix[row][col]=currVal+1;
                    rowQueue.add(row);
                    colQueue.add(col);
                }
            }
        }
        
        return matrix;
    }
}
