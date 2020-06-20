class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int res=Integer.MAX_VALUE;
        
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            map.putIfAbsent(words[i], new ArrayList<>());
            map.get(words[i]).add(i);
        }
        
        ArrayList<Integer> list1 = map.get(word1);
        ArrayList<Integer> list2 = map.get(word2);
        
        int i=0;
        int j=0;
        
        while(i<list1.size() && j<list2.size()){
            int idx1=list1.get(i);
            int idx2=list2.get(j);
            
            if(idx1 == idx2){
                i++;
            }
            
            else if(idx1 < idx2){
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