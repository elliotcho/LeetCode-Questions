class Solution {
    public int sumOfDigits(int[] A) {
        Arrays.sort(A);
        
        int sum=0;
        
        while(A[0]>0){
            int digit=A[0];
            
            sum+=digit;
            
            A[0]/=10;
        }
        
        return sum%2!=0? 0: 1;
    }
}