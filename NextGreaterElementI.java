class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        
        HashMap<Integer, Integer> map=new HashMap<>();
        int[] stack=new int[nums2.length]; int top=-1;
        
        for(int i=0;i<nums2.length;i++){
            while(top!=-1 && nums2[stack[top]]<nums2[i]){
                map.put(nums2[stack[top]], nums2[i]);
                top--;
            }
            
            map.put(nums2[i], -1);
            top++; stack[top]=i;
        }
        
        for(int j=0;j<nums1.length;j++){
            res[j]=map.get(nums1[j]);
        }
        
        return res;
    }
}
