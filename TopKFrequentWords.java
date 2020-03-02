class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map=new HashMap<>();
        
        for(String s: words){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        
        PriorityQueue<Map.Entry<String,Integer>> heap=
            new PriorityQueue<>((o1, o2) -> o1.getValue()==o2.getValue() ? 
                                o1.getKey().compareTo(o2.getKey()) : o2.getValue()-o1.getValue());
        
        heap.addAll(map.entrySet());
        
        ArrayList<String> res=new ArrayList<>();
        
        for(int i=0;i<k;i++){
            Map.Entry entry=(Map.Entry) heap.poll();
            res.add((String) entry.getKey());
        }
           
        return res;
    }
}