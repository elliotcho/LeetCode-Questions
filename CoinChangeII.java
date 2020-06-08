class Solution {
    public int change(int amount, int[] coins) {
        int[] table=new int[amount+1];
        
        table[0]=1;
        
        for(int coin: coins){
            for(int i=coin;i<=amount;i++){
                table[i]=table[i-coin]+table[i];
            }
        }
        
        return table[amount];
    }
}