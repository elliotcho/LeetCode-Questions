class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        ArrayList<List<Integer>> res=new ArrayList<>();
             
        int m=grid.length;
        int n=grid[0].length;
  
        int[] arr=new int[m*n];

        k=k%(m*n);
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                arr[i*n+j]=grid[i][j];
            }
        }
        
        reverse(0, arr.length-1, arr);
        reverse(0, k-1, arr);
        reverse(k, arr.length-1, arr);
        
        for(int i=0;i<m;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            
            for(int j=0;j<n;j++){
                temp.add(arr[i*n+j]);
            }
            
            res.add(temp);
        }
        
        return res;
    }
    
    private void reverse(int i, int j, int[] arr){
        if(i<0 || j<0 || i>=arr.length || j>=arr.length){
            return;
        }
        
        while(i<j){
            swap(i++, j--, arr);
        }
    }
    
    private void swap(int i, int j, int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}