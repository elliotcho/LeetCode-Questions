class Solution {
    public int findSpecialInteger(int[] arr) {
        int percent=arr.length/4;
        int res=0, count=1;
        
        if(arr.length==1){return arr[0];}
        
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                count++;
                if(count>percent){return arr[i];}
            }
            
            else{
                count=0;
                res=arr[i];
            }
        }
        
        
        
        return res;
    }
}
