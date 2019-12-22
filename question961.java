class Solution {
    public int repeatedNTimes(int[] A) {
        int[]  bucket=new int[10000];
        int end=0; 
        
        for(int i:A){
            bucket[i]++;
            if(bucket[i]>1){return i;}
            end=i;
        }
        
        return end;
    }
}