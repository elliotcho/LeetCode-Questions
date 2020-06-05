class Solution {
    public void reverseWords(char[] s) {
        reverse(0, s.length-1, s);
        
        int start=0;
        
        for(int i=0;i<s.length;i++){
            if(s[i]==' '){
                reverse(start, i-1, s);
                start=i+1;
            }
        }
        
        reverse(start, s.length-1, s);
        
        return;
    }
    
    private void reverse(int i, int j, char[] s){
        while(i<j){
            swap(i++, j--, s);
        }
    }
    
    private void swap(int i, int j, char[] s){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}