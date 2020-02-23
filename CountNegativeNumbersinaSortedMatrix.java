class Solution {
    public int countNegatives(int[][] grid) {
        int res=0;
        
        for(int[] row: grid){
            if(row[0]<0){res+=row.length;}
            
            else{
                for(int i=row.length-1;i>=0;i--){
                    if(row[i]>=0){break;}
                    else{res++;}
                }
            }
        }
        
        return res;
    }
}