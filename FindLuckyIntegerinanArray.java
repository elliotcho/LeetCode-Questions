class Solution {
    public int findLucky(int[] arr) {
        int[] bucket=new int[501];
        
        int res=0;
        int max=0;
        
        for(int num: arr){
            bucket[num]++;
            max=Math.max(max, num);
        }
        
        for(int i=1;i<=max;i++){
            if(bucket[i]==i){
                res=Math.max(res, bucket[i]);
            }
        }
      
        return res==0? -1: res;
    }
}