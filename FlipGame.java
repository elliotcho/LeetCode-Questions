class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        ArrayList<String> res = new ArrayList<>();
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='+' && s.charAt(i-1)=='+'){
                char[] newState = s.toCharArray();
                
                newState[i-1]='-';
                newState[i]='-';
                
                res.add(String.valueOf(newState));
            }
        }
        
        return res;
    }
}