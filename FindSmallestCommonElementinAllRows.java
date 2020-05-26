class Solution {
    public int smallestCommonElement(int[][] mat) {
        int[] bucket=new int[10001];
        
        for(int j=0;j<mat[0].length;j++){
            bucket[mat[0][j]]=1;
        }
        
        for(int i=1;i<mat.length;i++){
            int[] temp=new int[10001];
            
            for(int j=0;j<mat[i].length;j++){
                if(bucket[mat[i][j]]==1){
                    temp[mat[i][j]]=1;
                }
            }
            
            bucket=temp;
        }
        
        for(int i=0;i<bucket.length;i++){
            if(bucket[i]==1){
                return i;
            }
        }
        
        return -1;
    }
}