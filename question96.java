class Solution {
    public int numTrees(int n) {
        int[] table=new int[n+1];
        table[0]=1; table[1]=1;
        
        for(int i=2;i<table.length;i++){
            for(int j=0;j<i;j++){
                table[i]+=table[j]*table[i-j-1];
            }
        }
        
        return table[n];
    }
}