class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        ArrayList<String> res=new ArrayList<>();
        TrieNode root=new TrieNode();
        
        for(String word: words){
            addWordToTrie(root, word);
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                dfs(res, root, i, j, board);
            }
        }
        
        return res;
    }
    
    private void dfs(List<String> res, TrieNode node, int i, int j, char[][] board){
        if(node!=null && !node.word.equals("")){
            res.add(node.word);
            node.word="";
        }
        
        if(i<0 || j<0  || i>=board.length || j>=board[i].length || board[i][j]==' ' || node==null){
            return;
        }
        
        char c=board[i][j];
        board[i][j]=' ';
        
        dfs(res, node.children[c-97], i-1, j, board);   
        dfs(res, node.children[c-97], i+1, j, board);
        dfs(res, node.children[c-97], i, j-1, board);
        dfs(res, node.children[c-97], i, j+1, board);
        
        board[i][j]=c;
    }
    
    private void addWordToTrie(TrieNode root, String word){
        TrieNode curr=root;
        
        for(char c: word.toCharArray()){
            if(curr.children[c-97]==null){
                curr.children[c-97]=new TrieNode();
            }    
            
            curr=curr.children[c-97];
        }
        
        curr.word=word;
    }
    
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        String word="";
    }
}