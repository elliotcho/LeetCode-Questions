class Solution {
    public int integerReplacement(int n) {
        int res=0;
        
        while(n>1){
            res++;
            
            if(n%2!=0){
                res++;
                
                n/=2;
                
                if(n!=1 && n%2!=0){
                    n++;
                }
            }
            
            else{
                n/=2;
            }
        }
        
        return res;
    }
}