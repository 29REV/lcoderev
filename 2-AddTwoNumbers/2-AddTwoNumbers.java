// Last updated: 7/8/2026, 9:14:44 AM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode head1 = l1;
        // ListNode head2 = l2;
        int carry =0;
        ListNode ans= new ListNode(-1);
        ListNode spo=ans;
        while(l1 != null && l2!=null){
            int sum = (l1.val + l2.val+ carry)%10;
            carry = (l1.val + l2.val+carry)/10;
            ans.next=new ListNode(sum);
            l1=l1.next;
            l2=l2.next;
            ans=ans.next;
        }
        while (l1!=null){
            int sum = (l1.val+carry)%10;
           carry = (l1.val+carry)/10;
            ans.next = new ListNode(sum);
            l1=l1.next;
            ans=ans.next;
        }
        while (l2!=null){
            int sum = (l2.val+carry)%10;
          carry = (l2.val+carry)/10;
            ans.next = new ListNode(sum);
            l2=l2.next;
            ans=ans.next;
        }
        if(carry!=0){
            ans.next=new ListNode(carry);
            ans=ans.next;
        }
        return spo.next;

    }
}