/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       if(lists.length==0){return null;}
       return mergeSort(0, lists.length-1, lists);
    }
    
    public ListNode mergeSort(int start, int end, ListNode[] lists){
        if(end==start){return lists[start];}
        
        int mid=(start+end)/2;
        
        ListNode left=mergeSort(start,mid, lists);
        ListNode right=mergeSort(mid+1, end, lists);
        
        return merge(left, right);
    }
    
    public ListNode merge(ListNode l1, ListNode l2){
        if(l1==null){return l2;}
        if(l2==null){return l1;}
        
        ListNode resHead=new ListNode(0), res=resHead;
        
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                res.next=new ListNode(l2.val);
                l2=l2.next;
            }
            
            else{
                res.next=new ListNode(l1.val);
                l1=l1.next;
            }
            
            res=res.next;
        }
        
        if(l1!=null){res.next=l1;}
        if(l2!=null){res.next=l2;}
        
        return resHead.next;
    }
}