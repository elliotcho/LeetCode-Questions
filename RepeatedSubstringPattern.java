class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        
        for(int i=n/2; i>=1; i--){
            if(n%i==0){
                StringBuilder sb=new StringBuilder();
                
                int numRepeats=n/i;
                
                for(int j=0;j<numRepeats;j++){
                    sb.append(s.substring(0, i));
                }
                
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        
        return false;
    }
}