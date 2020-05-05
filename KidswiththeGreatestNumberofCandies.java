class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies=0;
        List<Boolean> res=new ArrayList<>();
        
        for(int c: candies){maxCandies=Math.max(maxCandies, c);}
        
        for(int c: candies){
            if(c+extraCandies>=maxCandies){
                res.add(true);
            }
            
            else{
                res.add(false);
            } 
        }
        
        return res;
    }
}