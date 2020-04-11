class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int[] row: matrix){
            
            int col=0, minInRow=Integer.MAX_VALUE;
            
            for(int j=0;j<row.length;j++){
                if(row[j]<minInRow){
                    minInRow=row[j];
                    col=j;
                }
            }
            
            if(maxInCol(matrix, col, minInRow)){res.add(minInRow);}
        }
        
        return res;
    }
    
    public boolean maxInCol(int[][] matrix, int col, int num){
        for(int i=0;i<matrix.length;i++){
            if(num<matrix[i][col]){return false;}
        }
        
        return true;
    }
}