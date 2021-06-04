package linkedlistproblems;

/*Given head which is a reference node to a singly-linked list.
The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
Return the decimal value of the number in the linked list.
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Input: head = [0]
Output: 0
*/

public class ConvertBinaryToDecimal {

    public int getDecimalValue1(ListNode head) {
        ListNode curr = head;
        StringBuilder sb = new StringBuilder();
        while (curr != null) {
            sb.append(curr.val);
            curr = curr.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public int getDecimalValue2(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = num * 2 + head.next.val;
            head = head.next;
        }
        return num;
    }
}
