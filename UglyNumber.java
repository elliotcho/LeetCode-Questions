class Solution {
    public boolean isUgly(int num) {
        if(num==0){return false;}
        
        for(int i=2;i<=5;i++){
            if(i==4){continue;}
            
            else{
                while(num%i==0){
                    num=num/i;
                }
            }
        }
        
        return num==1;
    }
}
