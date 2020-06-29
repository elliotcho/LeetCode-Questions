class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character, Integer> map =new HashMap<>();
        
        int res=0;
        
        int start=0;
        int end=0;
        
        while(end<s.length()){
            char charAtEnd = s.charAt(end);
            
            map.put(charAtEnd, map.getOrDefault(charAtEnd, 0) + 1);
            
            while(map.size()>2){
                char charAtStart=s.charAt(start);
                
                map.put(charAtStart, map.get(charAtStart)-1);
                
                if(map.get(charAtStart)==0){
                    map.remove(charAtStart);
                }
                
                start++;
            }
            
            end++;
            
            res=Math.max(end-start, res);
        }
        
        return res;
    }
}