class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] bucket=new int[1001];
        
        int[] res=new int[arr1.length];
        int index=0;
        
        for(int i=0;i<arr1.length;i++){
            bucket[arr1[i]]++;
        }
        
        for(int j=0;j<arr2.length;j++){
            while(bucket[arr2[j]]!=0){
                bucket[arr2[j]]--;
                res[index]=arr2[j];
                index++;
            }
        }
        
        for(int k=0;k<bucket.length;k++){
            while(bucket[k]>0){
                res[index]=k;
                index++;
                bucket[k]--;
            }
            if(index==arr1.length){break;}
        }
        
        return res;
    }
}
