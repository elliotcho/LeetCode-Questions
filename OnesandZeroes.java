class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] table=new int[m+1][n+1];
        
        for(String s: strs){
            int[] count=composition(s);
            
            for(int i=m; i>=count[0];i--){
                for(int j=n; j>=count[1];j--){
                    table[i][j]=Math.max(table[i-count[0]][j-count[1]]+1, table[i][j]);    
                }
            }    
        }
        
        return table[m][n];
    }
    
    public int[] composition(String s){
         int[] res=new int[2];
            
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                res[0]++;
            }
            
            else{
                res[1]++;    
            }
        }
        
        return res;
    }
}
