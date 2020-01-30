class Solution {
    public int numSquares(int n) {
        int[] table=new int[n+1];
        Arrays.fill(table, Integer.MAX_VALUE);
        
        table[0]=0;
        table[1]=1;
        
        for(int i=2;i<table.length;i++){
            for(int j=1; j*j<=i;j++){
                table[i]=Math.min(table[i], table[i-(j*j)]+1);  
            }
        }
        
        return table[n];
    }
}
