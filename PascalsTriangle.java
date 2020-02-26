class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        
        if(numRows==0){return res;}
        
        ArrayList<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);
        
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow=res.get(i-1);
            ArrayList<Integer> currentRow=new ArrayList<>();
            
            currentRow.add(1);
            
            for(int j=1;j<prevRow.size();j++){
                currentRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            
            currentRow.add(1);
            
            res.add(currentRow);
        }
        
        return res;
    }
}