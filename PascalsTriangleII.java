class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<List<Integer>> triangle=new ArrayList<>();
        
        ArrayList<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        for(int i=1;i<rowIndex+1;i++){
            List<Integer> prevRow=triangle.get(i-1);
            ArrayList<Integer> currentRow=new ArrayList<>();
            
            currentRow.add(1);
            
            for(int j=1;j<prevRow.size();j++){
                currentRow.add(prevRow.get(j)+prevRow.get(j-1));
            }
            
            currentRow.add(1);
            
            triangle.add(currentRow);
        }
        
        return triangle.get(triangle.size()-1);
    }
}