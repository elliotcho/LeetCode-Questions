class Solution {
    public int xorOperation(int n, int start) {
        int res=start;
        
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=start;
            start+=2;
        }
        
        for(int i=1;i<arr.length;i++){
            res^=arr[i];
        }
        
        return res;
    }
}