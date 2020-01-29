class Solution {
    public int heightChecker(int[] heights) {
        int[] original=heights.clone();
        Arrays.sort(heights);
        
        int res=0;
        for(int i=0;i<heights.length;i++){
            if(original[i]!=heights[i]){res++;}
        }
        
        return res;
    }
}
