/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(0);
        ListNode res=temp;
        while(l1!=null || l2!=null){
            int v1=101;int v2=101;
            if(l1!=null){
                v1=l1.val;
            }
            if(l2!=null){
                v2=l2.val;
            }
            if(v1<v2){
                temp.next=new ListNode(v1);
                temp=temp.next;
                l1=l1.next;
            }else{
                temp.next=new ListNode(v2);
                temp=temp.next;
                l2=l2.next;
            }
            
        }
        return res.next;
    }
}