class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        ArrayList<List<Integer>> res =new ArrayList<>();
        
        int count=1;
        
        for(int i=1;i<S.length();i++){
            if(S.charAt(i) != S.charAt(i-1)){
                if(count>=3){
                    res.add(Arrays.asList(i-count, i-1));
                }
                
                count=1;
            }
            
            else{
                count++;
                
                if(i==S.length()-1 && count>=3){
                    res.add(Arrays.asList(i-count+1, i));
                }
            }
        }
        
        return res;
    }
}