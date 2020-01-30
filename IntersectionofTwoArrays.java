class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map=new HashMap<>();
        ArrayList<Integer> intersect=new ArrayList<>();
        
        //put contents of first array into a HashMap
        for(int i=0;i<nums1.length;i++){map.put(nums1[i],0);}
        
        for(int j=0;j<nums2.length;j++){    
            if(map.containsKey(nums2[j]) && map.get(nums2[j])==0){
                intersect.add(nums2[j]);
                map.put(nums2[j],1);
            }
        }
        
        int[] res=new int[intersect.size()];
        for(int k=0;k<intersect.size();k++){
            res[k]=intersect.get(k);
        }
        
        return res;
    }
}
