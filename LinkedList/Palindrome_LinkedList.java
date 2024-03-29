class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        /* if the list contains even number of nodes then fast at the end points on null and in case of odd no. of nodes 
            the fast will point on null */
        while(fast!=null &&  fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
        }
        slow=reverse(slow);
        fast=head;
        while(slow!=null){
            if(fast.val!=slow.val) return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;
        }
        public ListNode reverse(ListNode head){
            ListNode prev=null;
            while(head!=null){
                ListNode forw=head.next;
                head.next=prev;
                prev=head;
                head=forw;
            }
            return prev;
        }
}
