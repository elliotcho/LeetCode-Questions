class Solution {
    public int minSteps(int n) {
        int[] table=new int[n+1];
        table[1]=0;
        
        for(int i=2;i<table.length;i++){
            table[i]=i;
            
            for(int j=i-1;j>1;j--){
                if(i%j==0){
                    table[i]=table[j]+(i/j);
                    break;
                }
            }
        }
        
        return table[n];
    }
}