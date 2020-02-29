class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, LinkedList<Integer>> map=new HashMap<>();
        
        ArrayList<List<Integer>> res=new ArrayList<>();
        
        for(int i=0;i<groupSizes.length;i++){
            LinkedList<Integer> group=new LinkedList<>();

            if(map.containsKey(groupSizes[i])){group=map.get(groupSizes[i]);}
            
            group.add(i);
            
            map.put(groupSizes[i], group);
            
            if(groupSizes[i]==group.size()){
                res.add(group);
                map.remove(groupSizes[i]);
            }
        }
        
        return res;
    }
}