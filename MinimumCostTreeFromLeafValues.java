class Solution {
    public int mctFromLeafValues(int[] arr) {
        int res = 0; 
        
        ArrayList<Integer> nums = new ArrayList<>();
        
        for(int i: arr){
            nums.add(i);
        }
        
        while(nums.size()!=1){
            int minProd = Integer.MAX_VALUE;
            
            int idx1 = 0;
            int idx2 = 0;
            
            for(int i=1;i<nums.size();i++){
                int currProd = nums.get(i-1) * nums.get(i);
                
                if(currProd < minProd){
                    minProd = currProd;
                    
                    idx1=i-1;
                    idx2=i;
                }
            }
            
            res+=minProd;
            
            if(nums.get(idx1) < nums.get(idx2)){
                nums.remove(idx1);
            }
            
            else{
                nums.remove(idx2);
            }
        }
        
        return res;
    }
}