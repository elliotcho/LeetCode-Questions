class Solution {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        
        int index=0, num=n, complement=n*-1;;
        
        if(n%2==0){
            while(index<res.length){
                res[index++]=num++;
                res[index++]=complement--;
            }
        }
        
        else{
            while(index<res.length-1){
                res[index++]=num++;
                res[index++]=complement--;
            }
            
            res[index]=0;
        }
        
        return res;
    }
}