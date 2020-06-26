class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res=0;
        
        TreeSet<Integer> set =new TreeSet<>();
        
        for(int i: arr2){set.add(i);}
        
        for(int i: arr1){
            Integer closestHigh=set.ceiling(i);
            Integer closestLow=set.floor(i);
            
            int diff=0;
            
            if(closestHigh==null){
                diff=i-closestLow;
            }
            
            else if(closestLow==null){
                diff=closestHigh-i;
            }
            
            else{
                diff=Math.min(i-closestLow, closestHigh-i);
            }
            
            res= diff > d? res+1: res;
        }
        
        return res;
    }
}
