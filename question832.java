class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] arr: A){
            
            //flip
            int k=arr.length-1;
            for(int i=0;i<k;i++){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                
                k--;
            }
            
            //invert
            for(int j=0; j<arr.length;j++){
                if(arr[j]==0){arr[j]=1;}
                else{arr[j]=0;}
            }
            
            
            
        }    
        return A;
    
    }
}