class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        
        if(nums.length==0){return res;}
        
        int[] table=new int[nums.length];
        table[0]=1;
        
        Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i++){
            table[i]=1;
            
            for(int j=i-1; j>=0;j--){
                if(nums[i]%nums[j]==0){
                    table[i]=Math.max(table[j]+1, table[i]);
                }
            }
        }
        
        int maxIdx=0;
        
        for(int i=1;i<table.length;i++){
            maxIdx=(table[i] > table[maxIdx])? i: maxIdx;
        }
        
        int n=nums[maxIdx];
        int count=table[maxIdx];
        
        for(int i=maxIdx; i>=0;i--){
            if(n % nums[i]==0 && table[i]==count){
                res.add(nums[i]);
                n=nums[i];
                count--;
            }
        }
        
        return res;
    }
}