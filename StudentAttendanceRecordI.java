class Solution {
    public boolean checkRecord(String s) {
        int absenceCount=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c=='L'){
                if(i>1 && c==s.charAt(i-1) &&  c==s.charAt(i-2)){
                    return false;
                }
            }
            
            else if(c=='A' && absenceCount==1){
                return false;
            }
            
            else if(c=='A' && absenceCount==0){
                absenceCount++;
            }
        }
        
        return true;
    }
}