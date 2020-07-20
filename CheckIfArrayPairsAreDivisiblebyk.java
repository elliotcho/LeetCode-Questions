class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] bucket = new int[k];
        
        for(int i=0;i<arr.length;i++){
            arr[i]%=k;
            
            if(arr[i] < 0){
                arr[i]+=k;
            }
            
            bucket[arr[i]]++;
        }
        
        for(int i=1;i<k;i++){
            if(bucket[i] != bucket[k-i]){
                return false;
            }
        }
        
        return bucket[0]%2 == 0;
    }
}