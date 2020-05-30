class MyCalendarThree {
    TreeMap<Integer, Integer> map;

    public MyCalendarThree() {
        map=new TreeMap<>();
    }
    
    public int book(int start, int end) {
        map.put(start, map.getOrDefault(start, 0) + 1);
        map.put(end, map.getOrDefault(end, 0) -1);
        
        int curr=0;
        int res=0;
        
        for(int v: map.values()){
            curr+=v;
            res=Math.max(res, curr);
        }
        
        return res;
    }
}
/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */