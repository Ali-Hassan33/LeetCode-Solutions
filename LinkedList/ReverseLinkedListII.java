 class Solution{
public ListNode reverseBetween(ListNode head, int m, int n) {
    // created a dummy node
    ListNode fakehead=new ListNode(0);
    // linking with head node
    fakehead.next=head;
    // finding the correct position for ref.variable "previous"
    ListNode prev=fakehead;
    for(int i=0; i<m-1; i++){
         prev=prev.next;
    }
    ListNode curr=prev.next;
    // n will always be greater since it is coming afterwards
    for(int i=0; i<n-m; i++){
        // defining the (temporary)position for forw 
        ListNode forw=curr.next;
        // note that the order of these lines down here can't be changed.        
        // To tackle this problem , there is a trick that match the nodes by going reverse for example
        //   4->5      see which node to  match with this ... and in this way this problem can be tackled.
        curr.next=forw.next;
        forw.next=prev.next;
        prev.next=forw;        
        }
        return fakehead.next;
  }
 }
