class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> dynamicList=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            dynamicList.add(index[i], nums[i]);
        }
        
        int[] res=new int[nums.length];
        
        for(int i=0;i<dynamicList.size();i++){
            res[i]=dynamicList.get(i);
        }
        
        return res;
    }
}