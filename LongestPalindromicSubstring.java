class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0){return "";}
        
        int start=0, end=0;
        
        for(int i=0;i<s.length();i++){
            int oneMiddle=expandMiddle(i, i, s);
            
            int twoMiddle=expandMiddle(i, i+1, s);
            
            int len=Math.max(oneMiddle, twoMiddle);

            if(len > end- start){
                start=i-((len-1)/2);
                end=i+(len/2);
            }
        }

        return s.substring(start, end+1);
    }
    
    public int expandMiddle(int start, int end, String s){
        if(end<start){return 0;}
        
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        
        return end-start-1;
    }
}