class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        for(int i=2;i<coordinates.length;i++){
            int dy1=coordinates[i][1]-coordinates[i-1][1];
            int dy0=coordinates[i-1][1]-coordinates[i-2][1];
            int dx1=coordinates[i][0]-coordinates[i-1][0];
            int dx0=coordinates[i-1][0]-coordinates[i-2][0];
            
            if(dy1*dx0 != dy0*dx1){
                return false;
            }
        }
        
        return true;
    }
}