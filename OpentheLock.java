class Solution {
    public int openLock(String[] deadends, String target) {
        HashSet<String> locked=new HashSet<>();
        for(String s: deadends){locked.add(s);}
    
        HashSet<String> visited=new HashSet<>();
        visited.add("0000");
        
        LinkedList<String> queue=new LinkedList<>();
        queue.add("0000");
        
        int level=0;
        
        while(queue.size()!=0){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                String curr_state=queue.remove();
                
                if(locked.contains(curr_state)){continue;}
                
                if(curr_state.equals(target)){return level;}
                
                char[] charArr=curr_state.toCharArray(); 
                
                for(int j=0;j<4;j++){
                    char pos=charArr[j];
                    
                    charArr[j]=(char)(((pos-'0'+1)%10)+'0');
                    String s1=String.valueOf(charArr);
                    
                    if(!locked.contains(s1) && !visited.contains(s1)){
                        visited.add(s1);
                        queue.add(s1);
                    }
                    
                    charArr[j]=(char)(((pos-'0'+9)%10)+'0');
                    String s2=String.valueOf(charArr);
                    
                    if(!locked.contains(s2) && !visited.contains(s2)){
                        visited.add(s2);
                        queue.add(s2);
                    }
                    
                    charArr[j]=pos;
                }
            }
            
            level++;
        }
        
        return -1;
    }
}