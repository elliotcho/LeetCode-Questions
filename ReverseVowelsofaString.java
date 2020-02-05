class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        
        int left=0, right=s.length()-1;
        
        while(left<right){
            if(!isVowel(arr[left])){left++;}
            
            if(!isVowel(arr[right])){right--;}
            
            if(isVowel(arr[left]) && isVowel(arr[right])){
                swap(left, right, arr);
                
                left++; 
                
                right--;
            }
        }
        
        return String.valueOf(arr);
    }
    
    public void swap(int i, int j, char[] arr){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' ||  c=='o' || c=='u';
    }
}