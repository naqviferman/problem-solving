package linkedlistproblems;

/*Write a function to delete a node in a singly-linked list.
You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.
It is guaranteed that the node to be deleted is not a tail node in the list.
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Input: head = [0,1], node = 0
Output: [1]
Input: head = [-3,5,-99], node = -3
Output: [5,-99]
*/

public class DeleteNodeDirectAccess {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next =  node.next.next;
    }
}
