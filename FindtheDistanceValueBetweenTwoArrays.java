class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res=0;
        
        for(int i=0;i<arr1.length;i++){
            boolean invalid=false;
            
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr2[j]-arr1[i]) <= d){
                    invalid=true;
                    break;
                }
            }
            
            if(!invalid){res++;}
        }
        
        return res;
    }
}