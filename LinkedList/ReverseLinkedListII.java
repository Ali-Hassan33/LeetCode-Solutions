﻿ class Solution{
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
        // To tackle this problem , there is a trick shown in the figure.
        curr.next=forw.next;
        forw.next=prev.next;
        prev.next=forw;        
        }
        return fakehead.next;
  }
 }
