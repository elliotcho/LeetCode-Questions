class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] bucket=new int[26];
        
        for(char c: magazine.toCharArray()){bucket[c-97]++;}
        
        for(char c: ransomNote.toCharArray()){
            if(bucket[c-97]==0){
                return false;
            }
            
            else{
                bucket[c-97]--;
            }
        }
        
        return true;
    }
}