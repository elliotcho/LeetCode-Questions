class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] table=new int[amount+1];
        table[0]=0;
        
        for(int i=1;i<table.length;i++){
            int needed=amount+1;
            
            for(int j=0; j<coins.length;j++){
                if(coins[j]<=i){
                    needed=Math.min(needed, table[i-coins[j]]+1);
                }
            }
            
            table[i]=needed;
        }
        
        if(table[amount]>amount && amount!=0){return -1;}
        
        return table[amount];
    }
}