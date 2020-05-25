class Solution {
    public List<Integer> transformArray(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        
        while(true){
            int[] temp=new int[arr.length];
            temp[0]=arr[0];
            temp[arr.length-1]=arr[arr.length-1];
            
            boolean change=false;
            
            for(int i=1;i<arr.length-1;i++){
                if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
                    temp[i]=arr[i]-1;
                    change=true;
                }
                
                else if(arr[i-1]>arr[i] && arr[i+1]>arr[i]){
                    temp[i]=arr[i]+1;
                    change=true;
                }
                
                else{
                    temp[i]=arr[i];
                }
            }
            
            arr=temp;
            
            if(!change){break;}
        }
        
        for(int i: arr){res.add(i);}
        
        return res;
    }
}