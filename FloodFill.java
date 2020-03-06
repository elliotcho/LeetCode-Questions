class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor){return image;}
        
        dfs(sr, sc, image, image[sr][sc], newColor);
        
        return image;
    }
    
    public void dfs(int i, int j, int[][] image, int val, int newVal){
        if(i<0 || j<0 || i>=image.length || j>=image[i].length || image[i][j]!=val){
            return;
        }
        
        image[i][j]=newVal;
        
        dfs(i-1,j, image, val, newVal);
        dfs(i+1, j, image, val, newVal);
        dfs(i, j-1, image, val, newVal);
        dfs(i, j+1, image, val, newVal);
    }
}

