class Solution {
    public int maxArea(int[] height) {
        int max=0,start=0, end=height.length-1;
        
        while(start<end){
            int area=Math.min(height[start], height[end])*(end-start);
            
            if(height[start]<height[end]){
                start++;
            }
            
            else{
                end--;
            }
            
            max=Math.max(area, max);
        }
        
        return max;
    }
}
