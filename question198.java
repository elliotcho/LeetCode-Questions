class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){return 0;}
        
        int[] table=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(i==0){
                table[i]=nums[i];
            }
            
            if(i==1){
                table[i]=Math.max(table[i-1], nums[i]);
            }
            
            if(i>=2){
                table[i]=Math.max(table[i-1], nums[i]+table[i-2]);    
            }
        }
        
        return table[table.length-1];
    }
}