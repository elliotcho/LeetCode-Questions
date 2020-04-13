class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i: nums){set.add(i);}
        
        int res=0;
        
        for(int i: nums){
            int count=1;
            
            int left=i-1;
            int right=i+1;
            
            while(set.contains(left)){
                count++;
                set.remove(left);
                left--;
            }
            
            while(set.contains(right)){
                count++;
                set.remove(right);
                right++;
            }
            
            res=Math.max(res, count);
        }

        return res;
    }
}