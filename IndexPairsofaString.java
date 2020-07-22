class Solution {
    public int[][] indexPairs(String text, String[] words) {
        TrieNode root = new TrieNode();
        
        for(String word: words){
            TrieNode curr =root;
            
            for(char c: word.toCharArray()){
                if(curr.children[c - 97] == null){
                    curr.children[c - 97] = new TrieNode();
                }
                
                curr = curr.children[c-97];
            }
            
            curr.isWord = true;
        }
        
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int start = 0 ; start<text.length();start++){
            TrieNode curr =root;
            char c = text.charAt(start);
            
            int end = start;
            
            while(curr.children[c - 97] != null){
                curr = curr.children[c - 97];
                
                if(curr.isWord){
                    list.add(new int[]{start, end});
                }
                
                end++;
                
                if(end == text.length()){
                    break;
                }
                
                c = text.charAt(end);
            }
        }
        
        int[][] res = new int[list.size()][2];
        
        for(int i=0;i<list.size();i++){
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }
        
        return res;
    }
    
    class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isWord;
    }
}