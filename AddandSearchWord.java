class WordDictionary {
    TrieNode root;
    
    /** Initialize your data structure here. */
    public WordDictionary() {
        root=new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode curr=root;
        
        for(char c: word.toCharArray()){
            if(curr.children[c-97]==null){
                curr.children[c-97]=new TrieNode();
            }
            
            curr=curr.children[c-97];
        }
        
        curr.isWord=true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return dfs(root, word, 0);
    }
    
    private boolean dfs(TrieNode root, String word, int pos){
        TrieNode curr=root;
        
        for(int i=pos;i<word.length();i++){
            char c=word.charAt(i);
            
            if(c=='.'){
                boolean res=false;
                
                for(int j=0;j<26;j++){
                    if(curr.children[j]!=null){
                        res=res || dfs(curr.children[j], word, i+1);
                    }
                    
                    if(res){
                        break;
                    }
                }
                
                return res;
            }
            
            else{
                if(curr.children[c-97]==null){
                    return false;
                }
                
                curr=curr.children[c-97];
            }
        }
        
        return curr.isWord;
    }
    
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isWord=false;
    }
}
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */