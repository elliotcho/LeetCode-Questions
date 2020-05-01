class Solution {
    //the variable name LE is used as a shorthand for 'less than or equal to'
    //the variable name LT is used as a shorthand for 'less than'
    
    public List<Integer> countSmaller(int[] nums) {    
        LinkedList<Integer> res=new LinkedList<>();
        
        if(nums.length==0){return res;}
        
        TreeNode root=new TreeNode(nums[nums.length-1]);
        res.addFirst(0);
        
        for(int i=nums.length-2;i>=0;i--){
            insert(res, root, nums[i]);
        }
        
        return res;
    }
    
    private void insert(LinkedList<Integer> res, TreeNode root, int newVal){
        int LT=0; 
        
        while(true){
            if(root.val>=newVal){
                root.LE++;
                
                if(root.left==null){
                    root.left=new TreeNode(newVal);
                    break;
                }
                
                else{
                    root=root.left;
                }
            }
            
            else{
                LT+=root.LE;
                
                if(root.right==null){
                    root.right=new TreeNode(newVal);
                    break;
                }
                
                else{
                    root=root.right;
                }
            }
        }
        
        res.addFirst(LT);
    }
    
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        int LE=1;
        
        TreeNode(int val){
            this.val=val;
        }
    }
}