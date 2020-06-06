class Solution {
    int[] total;
    Random rand;
    
    public Solution(int[] w) {
        total=w;
        
        for(int i=1;i<total.length;i++){
            total[i]+=total[i-1];
        }
        
        rand=new Random();
    }
    
    public int pickIndex() {
        int n=total.length;      
        
        int target=rand.nextInt(total[n-1])+1;
        
        int start=0;
        int end=n;
        
        while(start<end){
            int mid=start+(end-start)/2;
            
            if(total[mid]==target){
                return mid;
            }
            
            else if(total[mid]<target){
                start=mid+1;
            }
            
            else{
                end=mid;
            }
        }
        
        return start;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */