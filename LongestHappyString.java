class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder res=new StringBuilder();
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a1,a2)-> a2[0]-a1[0]);
        
        if(a>0){pq.add(new int[]{a, 0});}
        if(b>0){pq.add(new int[]{b, 1});}
        if(c>0){pq.add(new int[]{c, 2});}
        
        int[] prev={-1, -1};
        
        while(!pq.isEmpty()){       
            int[] curr = pq.poll();
            
            if(curr[1]==prev[1] && prev[0]==2){
                if(pq.isEmpty()){
                    break;
                }
                
                int[] newCurr = pq.poll();
                pq.add(curr);
                curr=newCurr;
            }
            
            res.append((char)(curr[1] + 'a'));
            curr[0]--;
         
            prev[0]= (prev[1]==curr[1])? prev[0]+1: 1;
            prev[1]=curr[1];
            
            if(curr[0]>0){
                pq.add(curr);
            }
        }
        
        return res.toString();
    }
}