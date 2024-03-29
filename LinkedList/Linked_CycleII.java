public class Solution {
    // if you are moving on a circular track with someone and your speed is 2x relative to that person you will definitely meet again
    public ListNode detectCycle(ListNode head) {
           ListNode slow=head;
           ListNode fast=head;
           while(fast!=null && fast.next!=null){
               slow=slow.next;
               fast=fast.next.next;
               if(slow==fast){
                   slow=head;
                   while(slow!=fast){
                        slow=slow.next;
                        fast=fast.next;
                   }
                   return slow;
               }
           }
           return null;
}
}   
