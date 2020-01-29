class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum=0;
        for(int stone:stones){
            sum+=stone;
        }
        
        boolean[] table=new boolean[sum+1];
        table[0]=true;
        
        sum=0;
        for(int i=0;i<stones.length;i++){
            sum+=stones[i];
            
            for(int j=sum; j>=stones[i]; j--){
                table[j]|=table[j-stones[i]];
            }
        }
        
        for(int k=sum/2; k>=0;k--){
            if(table[k]==true){return sum-k-k;}
        }
        
        return 0;
    }
}
