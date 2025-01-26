class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        Node prev = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (flag) {
            slow = head;
            // Node prev = fast;
            while (slow != fast) {
                prev = fast;
                fast = fast.next;
                slow = slow.next;
            }
            prev.next = null;
        }
    }
}