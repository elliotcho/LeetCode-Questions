class Solution {
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> set=new HashSet<>();
        for(String mutation: bank){set.add(mutation);}
        
        if(!set.contains(end)){return -1;}
        
        char[] molecules={'A', 'C', 'G', 'T'};
        
        LinkedList<String> queue=new LinkedList<>();
        queue.add(start);
        
        int level=1;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                char[] currMutation= queue.remove().toCharArray();
                
                for(int j=0;j<currMutation.length;j++){
                    char temp=currMutation[j];
                    
                    for(char c: molecules){
                        currMutation[j]=c;
                        
                        String newMutation=String.valueOf(currMutation);
                        
                        if(newMutation.equals(end)){
                            return level;
                        }
                        
                        if(set.contains(newMutation)){
                            set.remove(newMutation);
                            queue.add(newMutation);
                        }
                    }
                    
                    currMutation[j]=temp;
                }
            }
            
            level++;
        }
            
        return -1;
    }
}