class Solution {
    public double average(int[] salary) {
        double total=0;
        
        int minVal=Integer.MAX_VALUE;
        int maxVal=Integer.MIN_VALUE;
        
        for(int i: salary){
            minVal=Math.min(minVal, i);
            maxVal=Math.max(maxVal, i);
            
            total+=i;
        }
        
        double res= (total - minVal - maxVal)/(salary.length-2);
        
        return res;
    }
}