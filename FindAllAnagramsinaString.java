class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res=new ArrayList<>();
        
        int[] bucket=new int[26];
        
        for(char c: p.toCharArray()){bucket[c-97]++;}
        
        int start=0, end=0, count=p.length();
        
        while(end<s.length()){
            if(bucket[s.charAt(end++)-97]-->=1){count--;}
            
            if(count==0){res.add(start);}
            
            if(end-start==p.length() && bucket[s.charAt(start++)-97]++>=0){
                count++;
            }
        }
        
        return res;
    }
}