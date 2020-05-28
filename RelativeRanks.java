class Solution {
    public String[] findRelativeRanks(int[] nums) {
        String[] res=new String[nums.length];
        HashMap<Integer, Integer> map=new HashMap<>();
        int medal=1;
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        
        Arrays.sort(nums);
        reverse(nums);
        
        for(int i=0;i<nums.length;i++){
            if(medal==1){
                res[map.get(nums[i])]="Gold Medal";
            }
            
            else if(medal==2){
                res[map.get(nums[i])]="Silver Medal";
            }
            
            else if(medal==3){
                res[map.get(nums[i])]="Bronze Medal";
            }
            
            else{
                res[map.get(nums[i])]=String.valueOf(medal);
            }
            
            medal++;
        }
        
        return res;
    }
    
    private void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        
        while(start<end){
            swap(start++, end--, arr);
        }
    }
    
    private void swap(int i, int j, int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}