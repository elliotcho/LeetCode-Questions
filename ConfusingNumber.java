class Solution {
    public boolean confusingNumber(int N) {
       HashMap<Integer, Integer> map=new HashMap<>();
        
       fillMap(map);
        
       int oldNum=N;
       int newNum=0;
        
       while(N>0){
           int digit=N%10;
           
           if(map.get(digit)==-1){return false;}
           
           newNum=newNum*10+map.get(digit);
           
           N/=10;
       }
        
       return oldNum!=newNum;
    }
    
    private void fillMap(HashMap<Integer, Integer> map){
        for(int i=0;i<10;i++){
            if(i==2 || i==3 || i==4 || i==5 || i==7){
                map.put(i, -1);
            }
            
            else if(i==0 || i==1 || i==8){
                map.put(i, i);
            }
            
            else if(i==6){
                map.put(i, 9);
            }
            
            else{
                map.put(i, 6);
            }
        }
    }
}