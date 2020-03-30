class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0, -1);
        
        int count=0;
        int res=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){count--;}
            
            else if(nums[i]==1){count++;}
            
            if(map.containsKey(count)){res=Math.max(res, i-map.get(count));}
            
            else{map.put(count, i);}
            
        }
        
        return res;
    }
}