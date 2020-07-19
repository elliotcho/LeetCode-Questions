class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        
        while(numBottles > 0){
            if(numBottles - numExchange < 0){
                break;
            }
            
            numBottles -=numExchange;
            numBottles++;
            
            res++;
        }
        
        return res;
    }
}