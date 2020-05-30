class Solution {
    public int minMeetingRooms(int[][] intervals) {
        TreeMap<Integer, Integer> map=new TreeMap<>();
        
        for(int[] interval: intervals){
            map.put(interval[0], map.getOrDefault(interval[0], 0) + 1);
            map.put(interval[1], map.getOrDefault(interval[1], 0) - 1);
        }
        
        int curr=0;
        int res=0;
        
        for(int v: map.values()){
            curr+=v;
            res=Math.max(res, curr);
        }
        
        return res;
    }
}