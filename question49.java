class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, ArrayList> map=new HashMap<>();
        ArrayList<List<String>> res=new ArrayList<>();
        
        for(String s: strs){
            int code=createCode(s);
            
            if(map.containsKey(code)){
                map.get(code).add(s);
            }
            
            else{
                map.put(code, new ArrayList<String>());
                map.get(code).add(s);
            }
        }
        
        Iterator iter=map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry anagrams=(Map.Entry) iter.next();
            res.add((ArrayList<String>) anagrams.getValue());
        }
        
        return res;
    }
    
    public int createCode(String s){
        char[] bucket=new char[26];
        for(int i=0;i<s.length();i++){
            bucket[s.charAt(i)-97]++;
        }
        return Arrays.hashCode(bucket);
    }
}