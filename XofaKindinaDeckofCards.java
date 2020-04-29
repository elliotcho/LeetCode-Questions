class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] bucket=new int[10001];
        
        for(int i: deck){
            bucket[i]++;
        }
        
        int commonFactor=-1;
        
        for(int i=0;i<=10000;i++){
            if(bucket[i]>0){
                if(commonFactor==-1){
                    commonFactor=bucket[i];
                }
                
                else{
                    commonFactor=gcd(commonFactor, bucket[i]);
                }
            }
        }
        
        return commonFactor>=2;
    }
    
    private int gcd(int num1, int num2){
        return num1==0? num2: gcd(num2%num1, num1);
    }
}