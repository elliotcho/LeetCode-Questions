class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge=new int[nums1.length+nums2.length];
        int i =0, j=0, k=0;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){merge[k]=nums1[i]; i++;}
            else{merge[k]=nums2[j]; j++;}
            k++;
        }
        while(i<nums1.length){merge[k]=nums1[i]; k++; i++;}
        while(j<nums2.length){merge[k]=nums2[j]; k++; j++;}
        
        
        if(merge.length%2!=0){return merge[merge.length/2];}
        else{
            double left=merge[(merge.length/2)-1];
            double right=merge[merge.length/2];
            
            return (left+right)/2;
        }
    }
}