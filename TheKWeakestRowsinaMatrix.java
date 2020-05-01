class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> heap=
            new PriorityQueue<>((a, b)-> a[0]==b[0]? a[1]-b[1]: a[0]-b[0]);
        
        for(int i=0;i<mat.length;i++){
            heap.add(new int[]{countOnes(mat[i]), i});
        }
        
        int[] res=new int[k];
        
        for(int i=0;i<res.length;i++){res[i]=heap.poll()[1];}
        
        return res;
    }
    
    private int countOnes(int[] row){
        int n=row.length;
        
        int start=0, end=n-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(row[mid]==1){
                start=mid+1;
            }
            
            else{
                end=mid-1;
            }
        }
        
        return start;
    }
}