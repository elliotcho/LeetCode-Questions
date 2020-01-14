class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] stack=new int[nums.length]; int top=-1;
        
        int[] res=new int[nums.length];
        Arrays.fill(res, -1);
        
        for(int i=0;i<nums.length;i++){
            while(top!=-1 && nums[stack[top]]<nums[i]){
                res[stack[top]]=nums[i];
                top--;
            }
            
            top++; stack[top]=i;
        }
        
        for(int j=0;j<nums.length;j++){
            while(top!=-1 && nums[stack[top]]<nums[j]){
                res[stack[top]]=nums[j];
                top--;
            }
        }
        
        return res;
    }
}