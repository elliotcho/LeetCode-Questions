class Solution {
    public boolean canReach(int[] arr, int start) {
        HashSet<Integer> set=new HashSet<>();
        set.add(start);
        
        LinkedList<Integer> queue=new LinkedList<>();
        queue.add(start);
        
        while(queue.size()!=0){
            int current=queue.remove();
            
            if(arr[current]==0){return true;}
            
            int left=current-arr[current];
            
            if(left>=0 && !set.contains(left)){
                queue.add(left);
                set.add(left);
            }
            
            int right=current+arr[current];
            
            if(right<arr.length && !set.contains(right)){
                queue.add(right);
                set.add(right);
            }
        }
        
        return false;
    }
}