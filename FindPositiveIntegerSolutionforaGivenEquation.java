/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        
        int x=1;
        int y=1000;
        
        while(x<=1000 && y>0){
            int solution = customfunction.f(x, y);
            
            if(solution > z){
                y--;
            }
            
            else if(solution < z){
                x++;
            }
            
            else{
                ArrayList<Integer> temp = new ArrayList<>();
                
                temp.add(x++);
                temp.add(y--);
                
                res.add(temp);
            }

        }
        
        return res;
    }
}