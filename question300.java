class Solution {
    public int lengthOfLIS(int[] nums) {
       if(nums.length==0){return 0;} 
       int[] table=new int[nums.length];
  
       int res=0;
        
       for(int j=1;j<table.length;j++){
            for(int i=0;i<j;i++){
                if(nums[i]<nums[j]){
                    table[j]=Math.max(table[i]+1, table[j]);
                    res=Math.max(res, table[j]);
                }
            }
       }
        
       return res+1;
    }
}