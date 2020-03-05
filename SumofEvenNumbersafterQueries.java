class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] res=new int[A.length];
        
        int resIndex=0, evenSum=0;
        
        for(int i: A){
            if(i%2==0){evenSum+=i;}
        }

        for(int[] query: queries){
            if(A[query[1]]%2==0){evenSum-=A[query[1]];}
            
            A[query[1]]+=query[0];
            
            if(A[query[1]]%2==0){evenSum+=A[query[1]];}
            
            res[resIndex++]=evenSum;
        }
        
        return res;
    }
}