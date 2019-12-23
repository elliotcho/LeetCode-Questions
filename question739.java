class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] stack=new int[T.length];
        int top=-1;
        
        int[] res=new int[T.length];
        
        for(int i=0;i<T.length;i++){
            int temp=i-1; int day=1;
            
            while(top!=-1&&stack[top]<T[i]){ 
                if(res[temp]!=0){
                    temp--; day++;
                }
                
                else{
                    res[temp]=day;
                    top--;
                }
            }
            
            top++;
            stack[top]=T[i];
        }        
        
        return res;
    }
}