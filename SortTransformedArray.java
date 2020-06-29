class Solution {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int[] res=new int[nums.length];
        
        int start=0;
        int end =nums.length-1;
        
        int idx= (a>=0)? nums.length-1: 0;
        
        while(start<=end){
            int quadAtStart=calcQuad(nums[start], a, b, c);
            int quadAtEnd=calcQuad(nums[end], a, b, c);
            
            if(a>=0){
                if(quadAtStart>quadAtEnd){
                    res[idx--]=quadAtStart;
                    start++;
                }
                
                else{
                    res[idx--]=quadAtEnd;
                    end--;
                }
            }
            
            else{
                if(quadAtStart<quadAtEnd){
                    res[idx++]=quadAtStart;
                    start++;
                }
                
                else{
                    res[idx++]=quadAtEnd;
                    end--;
                }
            }
        }
        
        return res;
    }
    
    private int calcQuad(int x, int a, int b, int c){
        return a*x*x + b*x + c;
    }
}