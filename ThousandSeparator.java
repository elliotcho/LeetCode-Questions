class Solution {
    public String thousandSeparator(int n) {
        if(n == 0){
            return "0";
        }
        
        StringBuilder res = new StringBuilder();
        
        int digits = 0;
        
        while(n != 0){
            res.append(n%10);
            
            digits++;
            
            if(n/10 != 0 &&  digits%3 == 0){
                res.append('.');
            }
            
            n/=10;
        }
        
        return res.reverse().toString();
    }
}