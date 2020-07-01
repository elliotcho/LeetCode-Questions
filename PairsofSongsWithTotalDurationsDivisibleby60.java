class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int res=0;
        
        int[] bucket=new int[60];
        
        for(int i: time){
            int currMod= i % 60;
            
            int inverseMod=(60-currMod) % 60;
            
            if(bucket[inverseMod]!=0){
                res+=bucket[inverseMod];
            }
            
            bucket[currMod]++;
        }
        
        return res;
    }
}