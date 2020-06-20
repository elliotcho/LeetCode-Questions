class WordDistance {
    HashMap<String, ArrayList<Integer>> map;
    
    public WordDistance(String[] words) {
        map=new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            map.putIfAbsent(words[i], new ArrayList<>());
            map.get(words[i]).add(i);
        }
    }
    
    public int shortest(String word1, String word2) {
        int res=Integer.MAX_VALUE;
        
        ArrayList<Integer> list1=map.get(word1);
        ArrayList<Integer> list2=map.get(word2);
        
        int i=0;
        int j=0;
        
        while(i<list1.size() && j<list2.size()){
            int idx1=list1.get(i);
            int idx2=list2.get(j);
            
            if(idx1<idx2){
                res=Math.min(res, idx2-idx1);
                i++;
            }
            
            else{
                res=Math.min(res, idx1-idx2);
                j++;
            }
        }
        
        return res;
    }
}
/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */