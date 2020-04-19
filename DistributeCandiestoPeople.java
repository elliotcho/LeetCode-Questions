class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res=new int[num_people];
        
        int toGive=1;
        
        while(candies>0){
            for(int i=0;i<res.length;i++){
                if(candies-toGive>=0){
                    res[i]+=toGive;
                    candies-=toGive;
                }
                
                else{
                    res[i]+=candies;
                    candies-=candies;
                    break;
                }
 
                toGive++;
            }
        }
        
        return res;
    }
}