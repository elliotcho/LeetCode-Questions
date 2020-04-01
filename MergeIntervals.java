class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){return intervals;}
        
        Arrays.sort(intervals, (a1, a2) -> a1[0] - a2[0]);
        
        ArrayList<int[]> res=new ArrayList<>();
        int[] current=intervals[0];
        res.add(current);
        
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=current[1]){
                current[1]=Math.max(intervals[i][1], current[1]);
            }
            
            else{
                current=intervals[i];
                res.add(current);
            }
        }
        
        return res.toArray(new int[res.size()][2]);
    }
}