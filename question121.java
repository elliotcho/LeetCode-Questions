class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0){return 0;}
        
        int res=0, current=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>current){
                if(res<(prices[i]-current)){
                    res=prices[i]-current;
                }
            }
            
            else{
                current=prices[i];
            }
        }
        
        return res;
    }
}