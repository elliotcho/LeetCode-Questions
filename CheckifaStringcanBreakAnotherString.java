class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        
        int n=arr1.length;
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        boolean stringOneCanBreak=true;
        boolean stringTwoCanBreak=true;
        
        for(int i=0;i<n;i++){
            if(arr1[i]>arr2[i]){
                stringTwoCanBreak=false;
                break;
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr1[i]<arr2[i]){
                stringOneCanBreak=false;
                break;
            }
        }
        
        return stringOneCanBreak || stringTwoCanBreak;
    }
}