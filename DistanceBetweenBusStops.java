class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockWise=0;
        int total=0;
        
        for(int i=0;i<distance.length;i++){
            if(start<destination && (i>=start && i<destination)){
                clockWise+=distance[i];
            }
            
            if(start>destination && (i>=start || i<destination)){
                clockWise+=distance[i];
            }
            
            total+=distance[i];
        }
        
        return Math.min(clockWise, total-clockWise);
    }
}