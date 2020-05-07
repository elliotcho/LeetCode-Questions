class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res=new ArrayList<>();
        
        Map<String, Integer> map=new HashMap<>(); 
        
        for(String domain: cpdomains){
            int splitIdx=domain.indexOf(' ');
            
            int visits=Integer.valueOf(domain.substring(0, splitIdx));
            
            String parent=domain.substring(splitIdx+1);
            
            for(int i=0;i<parent.length();i++){
                if(parent.charAt(i)=='.'){
                    String child=parent.substring(i+1);   
                    map.put(child, map.getOrDefault(child, 0)+visits);
                }
            }
            
            map.put(parent, map.getOrDefault(parent, 0) + visits);
        }
       
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            res.add(entry.getValue() +" "+ entry.getKey());
        }
        
        return res;
    }
}