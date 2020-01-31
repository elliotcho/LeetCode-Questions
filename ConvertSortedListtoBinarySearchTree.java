/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        
        fillList(arr, head);
        
        return buildTree(0, arr.size()-1, arr);
    }
    
    public TreeNode buildTree(int start, int end, ArrayList<Integer> arr){
        if(start>end){return null;}
        
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        
        root.left=buildTree(start, mid-1, arr);
        root.right=buildTree(mid+1, end, arr);
        
        return root;
    }
    
    public ArrayList<Integer> fillList(ArrayList<Integer> arr, ListNode head){
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        
        return arr;
    }
}