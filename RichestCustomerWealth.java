class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        
        for(int[] a: accounts){
            int sum = 0;
                
            for(int i: a){
                sum += i;
            }
            
            res = Math.max(res, sum);
        }
        
        return res;
    }
}