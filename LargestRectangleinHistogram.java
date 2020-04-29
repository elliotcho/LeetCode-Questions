class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==0){return 0;}
        
        int n=heights.length;
        
        int[] left=new int[n];
        int[] right=new int[n];
        
        left[0]=-1;
        right[n-1]=n;
        
        for(int i=1;i<n;i++){
            int prevIdx=i-1;
            
            while(prevIdx>=0 && heights[prevIdx]>=heights[i]){
                prevIdx=left[prevIdx];
            }
            
            left[i]=prevIdx;
        }
        
        for(int i=n-2;i>=0;i--){
            int prevIdx=i+1;
            
            while(prevIdx<n && heights[prevIdx]>=heights[i]){
                prevIdx=right[prevIdx];
            }
            
            right[i]=prevIdx;
        }
        
        int area=0;
        
        for(int i=0;i<n;i++){
            area=Math.max(area, heights[i]*(right[i]-left[i]-1));
        }
        
        return area;
    }
}