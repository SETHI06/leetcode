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
    public ListNode partition(ListNode head, int x) {
        ListNode  Dummy1 = new ListNode(0);
        ListNode  Dummy2 = new ListNode(0);

        ListNode Smaller = Dummy1;
        ListNode Bigger = Dummy2;

        while (head != null){
            if (head.val < x){
                Smaller.next = head;
                Smaller = Smaller.next;
            }
            else {
                Bigger.next = head;
                Bigger = Bigger.next;
            }
            head = head.next;
        }
        Bigger.next = null;
        Smaller.next = Dummy2.next;
        return Dummy1.next;
    }
    
}