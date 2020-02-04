class Solution {
    public int thirdMax(int[] nums) {
        Integer max=null, secondMax=null, thirdMax=null;
        
        for(Integer i: nums){
            if(i.equals(max) || i.equals(secondMax) || i.equals(thirdMax)){
                continue;
            }
            
            if(max==null || i>max){
                thirdMax=secondMax;
                secondMax=max;
                max=i;
            }
            
            else if(secondMax==null || i>secondMax){
                thirdMax=secondMax;
                secondMax=i;
            }
            
            else if(thirdMax==null || i>thirdMax){
                thirdMax=i;
            }
        }
        
        return thirdMax==null? max: thirdMax;
    }
}