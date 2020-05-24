class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        ArrayList<int[]> res=new ArrayList<>();
        
        int a_pointer=0;
        int b_pointer=0;
        
        while(a_pointer<A.length && b_pointer<B.length){
            int firstVal=Math.max(A[a_pointer][0], B[b_pointer][0]);
            int secondVal=Math.min(A[a_pointer][1], B[b_pointer][1]);
            
            if(firstVal<=secondVal){
                res.add(new int[]{firstVal, secondVal});
            }
            
            if(A[a_pointer][1]<=B[b_pointer][1]){
                a_pointer++;
            }
            
            else{
                b_pointer++;
            }
        }
        
        return res.toArray(new int[res.size()][2]);
    }
}