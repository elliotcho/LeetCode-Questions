class Solution {
    public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
        HashMap<String, String> map = new HashMap<>();
   
        for(int i=0;i<regions.size();i++){
            String parent = regions.get(i).get(0);
            
            for(int j=1;j<regions.get(i).size();j++){
                map.put(regions.get(i).get(j), parent);
            }
        }
        
        HashSet<String> set = new HashSet<>();
        
        while(region1 != null){
            set.add(region1);
            region1 = map.get(region1);
        }
        
        while(region2 != null){
            if(set.contains(region2)){
                return region2;
            }
            
            region2 = map.get(region2);
        }
        
        return "";
    }
}