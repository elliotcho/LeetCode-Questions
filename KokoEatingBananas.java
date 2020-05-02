class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int start=1, end=(int) Math.pow(10, 9);
        
        while(start<end){
            int mid=start+(end-start)/2;
            int total=0;
            
            for(int p: piles){
                total+=(mid+p-1)/mid;
            }
            
            if(total>H){
                start=mid+1;
            }
            
            else{
                end=mid;
            }
        }
        
        return end;
    }
}