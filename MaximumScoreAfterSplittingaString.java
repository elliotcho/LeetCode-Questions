class Solution {
    public int maxScore(String s) {
        int zeroes=0;
        int ones=0;
        int res=0;
        
        for(char c: s.toCharArray()){
            if(c=='1'){ones++;}
        }
        
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zeroes++;
            }
            
            else{
                ones--;
            }
            
            res=Math.max(res, zeroes+ones);
        }
        
        return res;
    }
}