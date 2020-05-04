class MapSum {
    TrieNode root;

    /** Initialize your data structure here. */
    public MapSum() {
        root=new TrieNode();
    }
    
    public void insert(String key, int val) {
        TrieNode curr=root;
        
        for(char c: key.toCharArray()){
            if(curr.children.get(c)==null){
                curr.children.put(c, new TrieNode());
            }
            
            curr=curr.children.get(c);
        }
        
        curr.isWord=true;
        curr.value=val;
    }
    
    public int sum(String prefix) {
        TrieNode curr=root;
        
        for(char c: prefix.toCharArray()){
            if(curr.children.get(c)==null){
                return 0;
            }
            
            curr=curr.children.get(c);
        }
        
        return dfs(curr);
    }
    
    private int dfs(TrieNode node){
        int res=0;
        
        for(Map.Entry<Character, TrieNode> entry: node.children.entrySet()){
            res+=dfs(entry.getValue());
        }
        
        return res+node.value;
    }
    
    class TrieNode{
        Map<Character, TrieNode> children;
        boolean isWord;
        int value;
        
        TrieNode(){
            children=new HashMap<>();
            isWord=false;
            value=0;
        }
    }
}
/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */