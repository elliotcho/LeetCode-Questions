class MagicDictionary {
    TrieNode root;
    
    /** Initialize your data structure here. */
    public MagicDictionary() {
        root=new TrieNode();
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(String word: dict){
            add(word);
        }
    }
    
    private void add(String word){
        TrieNode curr=root;
        
        for(char c: word.toCharArray()){
            if(curr.children[c-97]==null){
                curr.children[c-97]=new TrieNode();
            }
            
            curr=curr.children[c-97];
        }
        
        curr.isWord=true;
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        return dfs(root, word, 0, true);
    }
    
    private boolean dfs(TrieNode root, String word, int idx, boolean extra){
        TrieNode curr=root;
        
        if(idx==word.length()){return curr.isWord && !extra;}
        
        char c=word.charAt(idx);
        
        for(int i=97;i<=122;i++){
            if(curr.children[i-97]!=null){
                if(c==i && dfs(curr.children[i-97], word, idx+1, extra)){
                    return true;
                }
                
                if(c!=i && extra && dfs(curr.children[i-97], word, idx+1, false)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isWord=false;
    }
}
/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */