class Solution {
    public int maxPower(String s) {
        int res=1;
        int count=1;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            
            else{
                res=Math.max(res, count);
                count=1;
            }
        }
        
        res=Math.max(res, count);
        
        return res;
    }
}