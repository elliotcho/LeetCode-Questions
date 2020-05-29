class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] bucket=new int[1001];
        
        for(int[] trip: trips){
            bucket[trip[1]]+=trip[0];
            bucket[trip[2]]-=trip[0];
        }
        
        for(int i=0;i<bucket.length;i++){
            if(capacity>=0){
                capacity-=bucket[i];
            }
            
            else{
                break;
            }
        }
        
        return capacity>=0;
    }
}