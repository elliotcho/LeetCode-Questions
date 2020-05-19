class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int satisfied=0;
        
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                satisfied+=customers[i];
            }
        }
        
        int start=0;
        int end=0;
        
        int currExtra=0;
        int maxExtra=0;
        
        while(end<customers.length){
            if(grumpy[end]==1){
                currExtra+=customers[end];
            }
                        
            if(end-start>=X-1){
                maxExtra=Math.max(maxExtra, currExtra);
                
                if(grumpy[start]==1){
                    currExtra-=customers[start];
                }
                
                start++;
            }
            
            end++;
        }
        
        return satisfied+maxExtra;
    }
}