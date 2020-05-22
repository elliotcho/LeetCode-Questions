class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        ArrayList<List<String>> res=new ArrayList<>();
        
        Arrays.sort(products);
        
        TrieNode root=new TrieNode();
        
        for(String product: products){
            TrieNode curr=root;
            
            for(char c: product.toCharArray()){
                if(curr.children[c-97]==null){
                    curr.children[c-97]=new TrieNode();
                }
                
                curr=curr.children[c-97];
                
                if(curr.words.size()<3){
                    curr.words.add(product);
                }
            }
        }
        
        TrieNode curr=root;
        
        for(int i=0;i<searchWord.length();i++){
            curr=curr.children[searchWord.charAt(i)-97];
            
            if(curr==null){
                for(int j=i;j<searchWord.length();j++){
                    res.add(Collections.EMPTY_LIST);
                }
                
                break;
            }
            
            res.add(curr.words);
        }
        
        return res;
    }
    
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        ArrayList<String> words=new ArrayList<>();
    }
}