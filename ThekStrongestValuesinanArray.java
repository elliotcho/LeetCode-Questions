class Solution {
    public int[] getStrongest(int[] arr, int k) {
        int[] res=new int[k];
        
        Arrays.sort(arr);
        
        int median=arr[(arr.length-1)/2];
            
        int start=0;
        int end=arr.length-1;
        
        int idx=0;
        
        while(k-->0){
            if(median-arr[start]>arr[end]-median){
                res[idx++]=arr[start++];
            }
            
            else{
                res[idx++]=arr[end--];
            }
        }
        
        return res;
    }
}