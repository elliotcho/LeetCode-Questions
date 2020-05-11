class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> res=new ArrayList<>();
        
        HashSet<Integer> set=new HashSet<>();
        for(int t: target){set.add(t);}
        
        for(int i=1;i<=n;i++){
            if(set.contains(i)){
                res.add("Push");
                set.remove(i);
            }
            
            else if(set.size()==0){
                break;
            }
            
            else{
                res.add("Push");
                res.add("Pop");
            }
        }
        
        return res;
    }
}