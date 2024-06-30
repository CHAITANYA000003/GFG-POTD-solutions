class Solution {
    public Node deleteNode(Node head, int n) {
        if (n == 1) {
            head = head.next;
            head.prev.next = null;
            // head.prev = null;
            return head;
        }

        Node temp = head;
        while (n > 1) {
            temp = temp.next;
            n--;
        }
        if (temp.next == null) {
            temp.prev.next = null;
            return head;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        // temp.next = null;
        // temp.prev = null;

        return head;
    }
}