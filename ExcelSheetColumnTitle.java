class Solution {
    public String convertToTitle(int n) {
        StringBuilder res=new StringBuilder();
        
        while(n!=0){
            int digit=(n-1)%26;
            
            res.append((char)(digit+65));
            
            n=(n-1)/26;
        }
        
        return res.reverse().toString();
    }
}