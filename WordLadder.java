class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>();
        
        for(String s: wordList){set.add(s);}
        
        if(!set.contains(endWord)){return 0;}
        
        LinkedList<String> queue=new LinkedList<>();
        queue.add(beginWord);
        int level=1;
        
        while(queue.size()!=0){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                String current=queue.remove();
                char[] sequence=current.toCharArray();
                
                for(int j=0;j<sequence.length;j++){
                    char original=sequence[j];
                    
                    for(char c='a';c<='z';c++){
                        sequence[j]=c;    
                        
                        String newWord=String.valueOf(sequence);
                        
                        if(newWord.equals(endWord)){return level+1;}
                        
                        if(set.contains(newWord)){
                            queue.add(newWord);
                            set.remove(newWord);
                        }
                    }
                    
                    sequence[j]=original;
                }
            }
            
            level++;
        }
            
        return 0;
    }
}