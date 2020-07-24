class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int rows = Integer.MAX_VALUE;
        int cols = Integer.MAX_VALUE;
        
        for(int[] op: ops){
            rows = Math.min(rows, op[0]);
            cols = Math.min(cols, op[1]);
        }
        
        return ops.length == 0? m*n: rows*cols;
    }
}