class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder res=new StringBuilder();
        
        int[] factorials=new int[n+1];
        ArrayList<Integer> nums=new ArrayList<>();
        
        int sum=1;
        factorials[0]=1;
        
        for(int i=1;i<=n;i++){
            sum*=i;
            factorials[i]=sum;
        }
        
        for(int i=1;i<=n;i++){
            nums.add(i);
        }
        
        k--;
        
        for(int i=1;i<=n;i++){
            int idx=k/factorials[n-i];
            
            res.append(nums.get(idx));
            
            nums.remove(idx);
            
            k-=factorials[n-i]*idx;
        }
        
        return res.toString();
    }
}