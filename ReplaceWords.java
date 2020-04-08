class Solution {
    TrieNode root=new TrieNode();
    
    public String replaceWords(List<String> dict, String sentence) {
        StringBuilder res=new StringBuilder();
        
        for(String s: dict){
            insert(s);
        }
        
        String[] split=sentence.split(" ");
        
        for(String word: split){
            res.append(search(word) + " ");
        }
        
        res.deleteCharAt(res.length()-1);
        
        return res.toString();
    }
    
    public class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isWord=false;
    }
    
    public void insert(String s){
        TrieNode curr=root;
        
        for(char c: s.toCharArray()){
            if(curr.children[c-97]==null){
                curr.children[c-97]=new TrieNode();
            }
            
            curr=curr.children[c-97];
        }
        
        curr.isWord=true;
    }
    
    public String search(String s){
        TrieNode curr=root;
        
        StringBuilder res=new StringBuilder();
        
        for(char c: s.toCharArray()){
           if(curr.children[c-97]==null || curr.isWord){
               break;
           }
            
           res.append(c);
            
           curr=curr.children[c-97];
        }
        
        return curr.isWord? res.toString(): s;
    }
}
