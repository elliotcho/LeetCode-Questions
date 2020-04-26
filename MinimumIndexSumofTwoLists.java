class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> res=new ArrayList<>();
        HashMap<String, Integer> map=new HashMap<>();
        int minSum=Integer.MAX_VALUE;
        
        for(int i=0;i<list1.length;i++){
            map.put(list1[i], i);
        }
        
        for(int j=0;j<list2.length;j++){
            int i=map.getOrDefault(list2[j], -1);
            
            if(i!=-1 && i + j < minSum){
                res.clear();
                res.add(list2[j]);
                minSum=i+j;
            }
            
            else if(i!=-1 && i + j == minSum){
                res.add(list2[j]);
            }
        }

        return res.toArray(new String[res.size()]);
    }   
}