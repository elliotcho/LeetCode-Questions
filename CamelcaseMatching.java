class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        ArrayList<Boolean> res=new ArrayList<>();
        
        for(String query: queries){
            res.add(isMatch(query.toCharArray(), pattern.toCharArray()));
        }
        
        return res;
    }
    
    public boolean isMatch(char[] query, char[] pattern){
        int end=0;
        
        for(int i=0;i<query.length;i++){
            if(end<pattern.length && query[i]==pattern[end]){
                end++;
            }
            
            else if(Character.isUpperCase(query[i])){
                return false;
            }
        }
                    
        return end==pattern.length;
    }
}