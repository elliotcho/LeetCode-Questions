/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class FindElements {
    HashMap<Integer, TreeNode> map=new HashMap<>();

    public FindElements(TreeNode root) {
        int idx=0;
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        
        root.val=0;
        
        while(queue.size()!=0){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                TreeNode curr=queue.remove();
                
                if(curr.left!=null){
                    curr.left.val=curr.val*2+1;
                    queue.add(curr.left);
                }
                
                if(curr.right!=null){
                    curr.right.val=curr.val*2+2;
                    queue.add(curr.right);
                }
                
                map.put(curr.val, curr);
            }
        }
    }
    
    public boolean find(int target) {
        return map.get(target)!=null? true: false;
    }
}
/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */