class Solution {
    public boolean canConstruct(String s, int k) {
        int[] bucket = new int[26];
        
        for(char c: s.toCharArray()){
            bucket[c - 'a']++;
        }
        
        int oddNum = 0;
        
        for(int i=0;i<bucket.length;i++){
            oddNum += bucket[i]%2;
        }
        
        return oddNum<=k && k<=s.length();
    }
}