class Solution {
    public int[] countBits(int num) {
        int[] table=new int[num+1];
        
        table[0]=0;
        
        for(int i=1;i<table.length;i++){
            table[i]=table[i-1 & i]+1;
        }
        
        return table;
    }
}