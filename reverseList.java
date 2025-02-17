class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode pre=null;
        ListNode next=null;
        ListNode cur=head;
        while(cur!=null){
            next= cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
         return pre; 
    }
}
