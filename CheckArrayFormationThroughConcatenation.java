class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], i);
        }
        
        for(int[] piece: pieces){
            int pos = -1;
            
            for(int i: piece){
                if(!map.containsKey(i)){
                    return false;
                }
                
                if(pos != -1 && map.get(i) != pos + 1){
                    return false;
                }
                
                pos = map.get(i);
            }
        }
        
        return true;
    }
}