class Solution {
    public List<Integer> sortArray(int[] nums) {
        mergeSort(nums);
        
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i: nums){res.add(i);}
        
        return res;
    }
    
    public void mergeSort(int[] arr){
        if(arr.length<=1){return;}
        
        int mid=arr.length/2;
        
        int[] left=new int[mid];
        int[] right=new int[arr.length-mid];
        
        for(int i=0;i<mid;i++){left[i]=arr[i];}
        for(int j=mid;j<arr.length;j++){right[j-mid]=arr[j];}
        
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
        
        return;
    }
    
    public void merge(int[] left, int[] right, int[] arr){
        int i=0, j=0, k=0;
        
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){arr[k++]=left[i++];}
            else{arr[k++]=right[j++];}
        }
        
        while(i<left.length){arr[k++]=left[i++];}
        while(j<right.length){arr[k++]=right[j++];}
            
        return;
    }
}