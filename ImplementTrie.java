class Trie {
    TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr=root;
        
        for(char c: word.toCharArray()){
            if(curr.children[c-97]==null){
                curr.children[c-97]=new TrieNode();
            }
            
            curr=curr.children[c-97];
        }
        
        curr.isWord=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr=root;
        
        for(char c: word.toCharArray()){
            if(curr.children[c-97]==null){
                return false;
            }
            
            curr=curr.children[c-97];
        }
        
        return curr.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix){
        TrieNode curr=root;
        
        for(char c: prefix.toCharArray()){
            if(curr.children[c-97]==null){
                return false;
            }
            
            curr=curr.children[c-97];
        }
        
        return true;
    }
    
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isWord=false;
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */