class Solution {
    public int countOdds(int low, int high) {
        int res = (high-low)/2;
        
        if(high%2 == 1 || low%2 == 1){
            res+=1;
        }
        
        return res;
    }
}