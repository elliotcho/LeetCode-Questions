class Solution {
    public String alienOrder(String[] words) {
        if(words.length == 0){
            return "";
        }
        
        Map<Character, HashSet<Character>> graph = new HashMap<>();
        int[] order = new int[27];
  
        buildGraph(graph, order, words);  
        
        if(order[26] == -1){
            return "";
        }
        
        String res = topSort(graph, order);
        
        return res.length() == graph.size() ? res: "";
    }
    
    public void buildGraph(Map<Character, HashSet<Character>> graph, int[] order, String[] words){
        for(String word: words){
            for(char c: word.toCharArray()){
                graph.put(c, new HashSet<>());
            }
        }
        
        for(int i=1;i<words.length;i++){
            String prevWord = words[i - 1];
            String currWord = words[i];
            
            int n = Math.min(prevWord.length() , currWord.length());
            
            boolean found = false;
            
            for(int j=0;j<n;j++){
                char prevChar = prevWord.charAt(j);
                char currChar= currWord.charAt(j);
                
                if(prevChar != currChar){
                    if(!graph.get(prevChar).contains(currChar)){
                        graph.get(prevChar).add(currChar);
                        order[currChar - 'a']++;
                    }
                    
                    found = true;
                    break;
                }
            }
            
            if(!found && prevWord.length() > currWord.length()){
                order[26] = -1;
            }
        }
    }
    
    public String topSort(Map<Character, HashSet<Character>> graph, int[] order){
        StringBuilder sb = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        
        for(char c: graph.keySet()){
            if(order[c - 'a'] == 0){
                queue.add(c);
            }
        }
        
        while(!queue.isEmpty()){
            char currChar = queue.poll();
            
            sb.append(currChar);
            
            for(char next: graph.get(currChar)){
                order[next - 'a']--;
                
                if(order[next - 'a'] == 0){
                    queue.add(next);
                }
            }
        }
        
        return sb.toString();
    }
}