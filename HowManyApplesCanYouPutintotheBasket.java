class Solution {
    public int maxNumberOfApples(int[] arr) {
        Arrays.sort(arr);
        
        int i=0;
        int total=0;
        
        for(i=0;i<arr.length;i++){
            if(total+arr[i]>5000){
                break;
            }
            
            total+=arr[i];
        }
        
        return i;
    }
}