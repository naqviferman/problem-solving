package linkedlistproblems;

/*Given a non-empty, singly linked list with head node head, return a middle node of linked list.
If there are two middle nodes, return the second middle node.
Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
*/

public class MiddleOfLL {
    
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
