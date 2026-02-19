/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to act as the head of our result list
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        // Loop continues if l1 exists, l2 exists, OR we still have a carry
        while (l1 != null || l2 != null || carry != 0) {
            // Get values, use 0 if the node is null (for lists of different lengths)
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            // Calculate sum and new carry
            int sum = carry + x + y;
            carry = sum / 10;
            
            // Create a new node with the digit (sum % 10) and attach it
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            // Move input pointers forward if possible
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // Return the list connected to the dummy head
        return dummyHead.next;
    }
}