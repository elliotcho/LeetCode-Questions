class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res=0;
        
        for(int i=1;i<points.length;i++){
            int[] current=points[i];
            
            int[] prev=points[i-1];
            
            res+=Math.max(Math.abs(current[0]-prev[0]), Math.abs(current[1]-prev[1]));
        }
        
        return res;
    }
}