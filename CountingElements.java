class Solution {
    public int countElements(int[] arr) {
        Arrays.sort(arr);
        
        int count=1;
        int res=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            
            else{
                if(arr[i]==arr[i-1]+1){
                    res+=count;
                }
                
                count=1;
            }
        }
        
        return res;
    }
}