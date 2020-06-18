class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        TreeMap<Integer, Integer> map=new TreeMap<>();
        
        for(int i: nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            
            else{
                map.put(i, map.get(i)+1);
            }
        }
        
        while(map.size()!=0){
            int min=map.firstKey();
            
            for(int i=min;i<(min+k);i++){
                if(!map.containsKey(i)){return false;}
                
                else if(map.get(i)==1){map.remove(i);}
                
                else{map.put(i, map.get(i)-1);}
            }
        }
        
        return true;
    }
}