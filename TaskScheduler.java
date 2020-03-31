class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] bucket=new int[26];
        
        for(char c: tasks){bucket[c-65]++;}
        
        Arrays.sort(bucket);
        
        int max_val=bucket[25]-1;
        int idle=max_val*n;
        
        for(int i=24;i>=0;i--){
            idle-=Math.min(bucket[i], max_val);
        }
        
        return idle>0? tasks.length+idle: tasks.length;
    }
}