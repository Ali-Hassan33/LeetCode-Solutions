// Iterative approach
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode=null;
        while(head!=null){
        ListNode nextNode=head.next;
        head.next=prevNode;
        prevNode=head;
        head=nextNode;
}
        return prevNode;
    }
}
//recursive aproach
class Solution {
    public ListNode reverseList(ListNode head) {
       return reverse(head,null);
    }
    public ListNode reverse(ListNode head, ListNode prevNode){
        if(head==null)
        return prevNode;
        ListNode nextNode=head.next;
        head.next=prevNode;
         return reverse(nextNode,head);
    }
     }
