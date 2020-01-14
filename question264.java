class Solution {
    public int nthUglyNumber(int n) {
        int[] table=new int[n+1];
        table[1]=1;
        
        int i2=1, i3=1, i5=1;
        
        int m2=table[i2]*2;
        int m3=table[i3]*3;
        int m5=table[i5]*5;
        
        for(int i=2;i<table.length;i++){
            table[i]=Math.min(m2, Math.min(m3,m5));
            
            if(table[i]==m2){
                i2++;  
                m2=table[i2]*2;  
            }
            
            if(table[i]==m3){
                i3++;
                m3=table[i3]*3;
            }
            
            if(table[i]==m5){
                i5++;
                m5=table[i5]*5;
            }
        }
        
        return table[n];
    }
}