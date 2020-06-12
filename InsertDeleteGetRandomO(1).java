class RandomizedSet {
    ArrayList<Integer> nums;
    HashMap<Integer, Integer> map;
    Random rand;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        nums=new ArrayList<>();
        map=new HashMap<>();
        rand=new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        
        nums.add(val);
        map.put(val, nums.size()-1);
        
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        
        int idx=nums.indexOf(val);
        
        //swap 'val' with the value at the end of the array
        Collections.swap(nums, idx, nums.size()-1);
        map.put(nums.get(idx), idx);
        
        //remove 'val' from both the map and array
        map.remove(nums.get(nums.size()-1));
        nums.remove(nums.size()-1);
        
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {       
        return nums.get(rand.nextInt(nums.size()));
    }
}
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */