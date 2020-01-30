class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length()-9;i++){
            String sequence=s.substring(i, i+10);
            if(map.containsKey(sequence)){
                map.put(sequence, 1);
            }
            else{
                map.put(sequence,0);
            }
        }
        
        ArrayList<String> res=new ArrayList<>();
        
        Iterator iter=map.entrySet().iterator(); 
        while(iter.hasNext()){
            Map.Entry entry=(Map.Entry) iter.next();
            if((int) entry.getValue()>0){
                res.add((String) entry.getKey());
            }
        }
        
        return res;
    }
}
