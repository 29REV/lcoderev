// Last updated: 1/27/2026, 9:18:36 PM
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
12    public ListNode middleNode(ListNode head) {
13        ListNode slow=head;
14        ListNode fast =head;
15        while(fast!=null && fast.next !=null){
16            fast=fast.next.next;
17            slow=slow.next;
18        }
19        return slow;
20        
21    }
22}