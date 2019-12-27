class Solution {
    public int[][] generateMatrix(int n) {
        int[][]res=new int[n][n];
        
        int top=0, bottom=n-1, left=0, right=n-1;
        int direction=0, num=1;
        
        while(top<=bottom && left<=right){
            if(direction==0){
                for(int i=left;i<=right;i++){res[top][i]=num++;} top++;
            }
            
            if(direction==1){
                for(int i=top;i<=bottom;i++){res[i][right]=num++;} right--;
            }
            
            if(direction==2){
                for(int i=right;i>=left;i--){res[bottom][i]=num++;} bottom--;
            }
            
            if(direction==3){
                for(int i=bottom;i>=top;i--){res[i][left]=num++;} left++;
            }
            
            direction=(direction+1)%4;
        }
        
        return res;
    }
}