class Solution {
    public int countLargestGroup(int n) {
        int res=0;
        int maxSize=0;
        int[] map=new int[37];
        
        for(int i=1;i<=n;i++){
            map[computeSum(i)]++;
        }
        
        for(int i=1;i<map.length;i++){
            maxSize=Math.max(maxSize, map[i]);    
        }
        
        for(int i=1;i<map.length;i++){
            if(map[i]==maxSize){
                res++;
            }
        }
        
        return res;
    }
    
    private int computeSum(int x){
        int res=0;
        
        while(x>0){
            res+=x%10;
            x/=10;
        }
        
        return res;
    }
}