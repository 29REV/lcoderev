// Last updated: 1/27/2026, 9:38:34 PM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        ListNode fast =head;
14        ListNode slow=head;
15        if(head==null || head.next ==null || k==0){
16            return head;
17        }
18        int n=0;
19        while(fast!=null){
20            fast=fast.next;
21            n++;
22        }
23        fast=head;
24        k=k%n;
25        if(k==0) return head;
26        for(int i=0;i<k;i++){
27            fast=fast.next;
28        }
29        while(fast.next!=null){
30            fast =fast.next;
31            slow=slow.next;
32        }
33        fast.next=head;
34        head=slow.next;
35        slow.next=null;
36        return head;
37    }
38}