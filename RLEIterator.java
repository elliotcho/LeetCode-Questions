class RLEIterator {
    int[] A;
    
    int idx = 0;

    public RLEIterator(int[] A) {
        this.A = A;
    }
    
    public int next(int n) {
        for(int i = 0; i<A.length-1; i+=2){
            if(A[i] >= n){
                A[i]-=n;
                return A[i+1];
            }
            
            else{
                n-=A[i];
                A[i] = 0;
            }
        }
        
        return -1;
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(A);
 * int param_1 = obj.next(n);
 */