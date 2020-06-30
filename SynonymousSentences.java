class Solution {
    public List<String> generateSentences(List<List<String>> synonyms, String text) {
        ArrayList<String> res=new ArrayList<>();
        res.add(text);
        
        HashMap<String, LinkedList<String>> map =new HashMap<>();
        
        for(List<String> pair: synonyms){
            String word1=pair.get(0);
            String word2=pair.get(1);
            
            map.putIfAbsent(word1, new LinkedList<>());
            map.putIfAbsent(word2, new LinkedList<>());
            
            map.get(word1).add(word2);
            map.get(word2).add(word1);
        }
        
        HashSet<String> visited = new HashSet<>();
        visited.add(text);
        
        LinkedList<String> queue =new LinkedList<>();
        queue.add(text);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            String[] curr=queue.remove().split(" ");
            
            for(int i=0;i<curr.length;i++){
                if(!map.containsKey(curr[i])){
                    continue;
                }
                
                else{
                    for(String word: map.get(curr[i])){
                        curr[i]=word;
                        
                        String newSentence = String.join(" ", curr);
                        
                        if(!visited.contains(newSentence)){
                            visited.add(newSentence);
                            queue.add(newSentence);
                            res.add(newSentence);
                        }
                    }
                }
            }
        }
            
        Collections.sort(res);
        
        return res;
    }
}