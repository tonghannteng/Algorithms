//  237. Delete Node in a Linked List

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class DeleteNodeLinkedList {
    fun deleteNode(node: ListNode?) {
        if (node != null) {
            node.`val` = node.next!!.`val`
            node.next = node.next!!.next
        }
    }
}