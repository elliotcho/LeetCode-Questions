/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        
        constructString(root, sb);
        
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString();
    }
    
    private void constructString(TreeNode root, StringBuilder sb){
        if(root==null){
            sb.append("n");
            sb.append(",");
        }
        
        else{
            sb.append(root.val);
            sb.append(",");
            constructString(root.left, sb);
            constructString(root.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split=data.split(",");
        
        LinkedList<String> queue=new LinkedList<>();
        
        for(String s: split){queue.add(s);}
        
        return constructTree(queue);
    }
    
    private TreeNode constructTree(LinkedList<String> queue){
        String val= queue.remove();
        
        if(val.equals("n")){
            return null;
        }
        
        else{
            TreeNode root=new TreeNode(Integer.valueOf(val));
            root.left=constructTree(queue);
            root.right=constructTree(queue);
            return root;
        }
    }
}
// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));