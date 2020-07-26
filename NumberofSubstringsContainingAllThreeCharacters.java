class Solution {
    public int numberOfSubstrings(String s) {
        int res = 0;
        int[] bucket = new int[3];
        
        int start = 0;
        int count = 0;
        
        for(int i=0;i<s.length();i++){
            bucket[s.charAt(i) - 'a']++;
            
            while(bucket[0]>0 && bucket[1]>0 && bucket[2]>0){
                bucket[s.charAt(start++) - 'a']--;
                count++;
            }
            
            res+=count;
        }
        
        return res;
    }
}