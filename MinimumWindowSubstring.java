class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0){
            return "";
        }
        
        HashMap<Character, Integer> map=new HashMap<>();
        
        for(char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        int start=0;
        int end=0;
        
        int minStart=0;
        int minEnd=s.length()+1;
        
        int count=0;
        
        while(end<s.length()){
            if(map.containsKey(s.charAt(end))){
                map.put(s.charAt(end), map.get(s.charAt(end))-1);
                
                if(map.get(s.charAt(end))>=0){
                    count++;
                }
            }
            
            while(count==t.length()){
                if(end-start+1<minEnd-minStart){
                    minStart=start;
                    minEnd=end+1;
                }
                
                if(map.containsKey(s.charAt(start))){
                    map.put(s.charAt(start), map.get(s.charAt(start))+1);
                    
                    if(map.get(s.charAt(start))>0){
                        count--;
                    }
                }
                
                start++;
            }
            
            end++;
        }
        
        if(minEnd-minStart>s.length()){return "";}
        
        return s.substring(minStart, minEnd);
    }
}