class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Base case: empty list
        if (head == null) return null;
        // Recursively remove from the rest of the list
        head.next = removeElements(head.next, val);
        // If current node needs to be removed, skip it
        return head.val == val ? head.next : head;
    }
}
