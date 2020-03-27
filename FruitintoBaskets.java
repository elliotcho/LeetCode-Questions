class Solution {
    public int totalFruit(int[] tree) {
        int last_fruit=-1;
        int second_last_fruit=-1;
        
        int last_fruit_count=0;
        
        int current=0;
        int max=0;
        
        for(int f: tree){
            if(f==last_fruit || f==second_last_fruit){
                current++;
            }
            else{
                current=last_fruit_count+1;
            }
            
            if(f==last_fruit){
                last_fruit_count++;
            }
            else{
                last_fruit_count=1;
            }
            
            if(f != last_fruit){
                second_last_fruit=last_fruit;
                last_fruit=f;
            }
            
            max=Math.max(max, current);
        }
        
        return max;
    }
}