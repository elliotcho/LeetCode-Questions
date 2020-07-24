class Solution {
    public int numSpecialEquivGroups(String[] A) {
        HashSet<String> set = new HashSet<>();
        
        for(String s: A){
            int[] odd = new int[26];
            int[] even = new int[26];
            
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                
                if(i%2==0){
                    even[c - 'a']++;
                }
                
                else{
                    odd[c - 'a']++;
                }
            }
            
            set.add(Arrays.toString(odd) + Arrays.toString(even));
        }
        
        return set.size();
    }
}