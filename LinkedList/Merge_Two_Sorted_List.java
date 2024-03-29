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
        ListNode list=new ListNode(0);
        ListNode handler=list;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
            handler.next=l1;
            l1=l1.next;
            }
            else{
            handler.next=l2;
            l2=l2.next;}
            handler=handler.next;
        }
        if(l1==null)
        handler.next=l2;
        else if(l2==null)
        handler.next=l1;
        return list.next;
 }
 }
