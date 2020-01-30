class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            
            else{
                map.put(c, 1);
            }
        }
               
        PriorityQueue<Map.Entry<Character,Integer>> heap=
            new PriorityQueue<>((entry1, entry2) -> entry2.getValue()-entry1.getValue());
        heap.addAll(map.entrySet());
        
        StringBuilder res=new StringBuilder();
        
        int size=heap.size();
        for(int i=0;i<size;i++){
            Map.Entry entry=heap.poll();           
            int count=(int) entry.getValue();
            
            while(count>0){
                res.append((char) entry.getKey());
                count--;
            }    
        }
        
        return res.toString();
    }
}
