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
    
    // Function returns a node with value of l1 and l2 nodes summed.
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy head of the list, zero doesnt affect final value
        ListNode dummy = new ListNode(0);
        // Create a current node to act as an iterator
        ListNode current = dummy;
        
        // Carry is needed for the case where 2 digit's sum exceeds 9
        int carry = 0;
        
                
        while(l1 != null || l2 != null || carry != 0){
            
            // Initialize x as the value of l1 when not null            
            int x = (l1 != null) ? l1.val : 0;
            // Initialize y as the value of l2 when not null    
            int y = (l2 != null) ? l2.val : 0;
            
            // Value of the current sum is the value of the digits plus any carry value
            int sum = x + y + carry;
            // Update carry
            carry = sum / 10;
            
            // Set the next node to be sum*mod(10) - for single digit
            current.next = new ListNode(sum % 10);
            //Advance the node
            current = current.next;
            
            // If l1 or l2 are NOT null, advance the nodes respectively
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        
        // Return the new node value               
        return dummy.next;
        
    }
}