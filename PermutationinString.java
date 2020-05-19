class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] bucket=new int[26];
        
        for(char c: s1.toCharArray()){
            bucket[c-97]++;
        }
        
        int start=0;
        int end=0;
        int count=0;
        
        while(end<s2.length()){
            if(bucket[s2.charAt(end++)-97]-->=1){
                count++;
            }
            
            if(count==s1.length()){return true;}
            
            if(end-start==s1.length() && bucket[s2.charAt(start++)-97]++>=0){
                count--;
            }
        }
        
        return false;
    }
}