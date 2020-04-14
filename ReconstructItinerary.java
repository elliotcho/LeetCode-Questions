class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        ArrayList<String> res=new ArrayList<>();
        
        HashMap<String, PriorityQueue<String>> map=new HashMap<>();
        
        for(List<String> ticket: tickets){
            if(!map.containsKey(ticket.get(0))){
                map.put(ticket.get(0), new PriorityQueue<>());
            }
            
            map.get(ticket.get(0)).add(ticket.get(1));
        }
        
        dfs("JFK", map, res);
        
        return res;
    }
    
    public void dfs(String departure, Map<String, PriorityQueue<String>> map, List<String> res){
        PriorityQueue<String> arrivals=map.get(departure);
        
        while(arrivals!=null && arrivals.size()!=0){
            dfs(arrivals.poll(), map, res);
        }
        
        res.add(0, departure);
    }
}