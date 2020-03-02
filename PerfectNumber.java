class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==0 || num==1){return false;}
        
        int res=0;
        
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0 && i!=num/i){
                res+=(num/i)+i;
            }
            
            else if(num%i==0 && i==num/i){
                res+=i;
            }
        }
        
        res++;
        
        return res==num;
    }
}