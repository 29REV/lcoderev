// Last updated: 1/27/2026, 9:13:22 PM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode slow=head;
14        ListNode fast =head;
15        for (int i = 0; i < n; i++) {
16        fast = fast.next;
17        }
18        if(fast== null){
19            return head.next;
20        }
21        
22        while(fast!=null && fast.next!=null ){
23            slow=slow.next;
24            fast=fast.next;
25        }
26        
27            slow.next=slow.next.next;
28        return head;
29    }
30}