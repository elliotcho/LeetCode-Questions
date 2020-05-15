class Solution {
    public String reorganizeString(String S) {
        StringBuilder res=new StringBuilder();
	PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
	int[] bucket=new int[26];
        
        for(char c: S.toCharArray()){
            bucket[c-97]++;
        }
        
        for(int i=0;i<26;i++){
            if(bucket[i]!=0){pq.add(new int[]{i, bucket[i]});}
        }
        
        int[] prev={-1, 0};
        
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            
            if(prev[1]>0){pq.add(prev);}
            
            res.append((char)(curr[0]+97));
            curr[1]--;
            prev=curr;
            
            if(pq.isEmpty()&&curr[1]>0){
                return "";
            }
        }
        
        return res.toString();
    }
}