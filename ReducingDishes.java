class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        
        int res=0;
        int total=0;
        
        for(int i=satisfaction.length-1;i>=0;i--){
            if(satisfaction[i]<-total){
                break;
            }
            
            total+=satisfaction[i];
            res+=total;
        }
        
        return res;
    }
}