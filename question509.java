class Solution {
    public int fib(int N) {
        int[] arr=new int[N+1];
        return helper(N, arr);   
    }
    
    
    public int helper(int N, int[] arr){
        if(N==0){return 0;}
        if(N==1){return 1;}
        else{
            if(arr[N]==0){
                arr[N]=helper(N-2, arr)+helper(N-1,arr);
            }
            
            return arr[N];
        }
    }
    
}