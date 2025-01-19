class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        int len = 0;
        Node temp = head;
        Node end = null;
        while (temp != null) {
            if (temp.next == null) {
                end = temp;
            }
            temp = temp.next;
            len++;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }

        temp = head;
        while (k-- > 1) {
            temp = temp.next;
        }
        end.next = head;
        head = temp.next;
        temp.next = null;

        return head;
    }
}