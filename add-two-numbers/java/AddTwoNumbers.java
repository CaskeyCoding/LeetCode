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
        /*
        *  Traverse lists at same time and perform basic arithmetic
           342
         + 465
         _____
            8 0 7
            
            Start adding at right most digit
            This makes the reverse order work for us
        */
        ListNode newHead = new ListNode(0);
        ListNode l3 = newHead;
        int carry = 0;
        while(l1 !=null || l2 !=null){
            int l1Val = (l1 !=null) ? l1.val : 0;
            int l2Val = (l2 !=null ) ? l2.val: 0;
            int currentSum = l1Val + l2Val + carry;
            carry = currentSum/10;
            int lastDigit = currentSum % 10;
            
            ListNode newNode = new ListNode(lastDigit);
            l3.next = newNode;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            l3 = l3.next;
        }
        if(carry > 0){
            ListNode new_node = new ListNode(carry);
            l3.next = new_node;
            l3 = l3.next;
        }
        return newHead.next;
    }
}

