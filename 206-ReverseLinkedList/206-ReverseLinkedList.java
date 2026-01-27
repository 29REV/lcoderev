// Last updated: 1/27/2026, 8:35:57 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseList(ListNode head) {
13         ListNode prev=null;
14        ListNode curr=head;
15        if(head==null || head.next==null){
16            return head;
17        }
18        ListNode after=head.next;
19        while (after!=null){
20            curr.next=prev;
21            prev=curr;
22            curr=after;
23            after=after.next;
24        }
25        curr.next=prev;
26        return curr;
27    }
28}