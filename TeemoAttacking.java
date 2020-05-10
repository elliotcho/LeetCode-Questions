class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0){return 0;}
        
        int elapsed=0;
        
        for(int i=1;i<timeSeries.length;i++){
            elapsed+=Math.min(timeSeries[i]-timeSeries[i-1], duration);
        }
        
        return elapsed+duration;
    }
}