class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node it = head;
        Node last, temp = head;
        int count = 1;
        while (it.next != null) {
            count++;
            if (count == k + 1) {
                temp = it;
            }
            it = it.next;
        }
        // System.out.println(count);
        if (count == k) {
            return head;
        }
        last = it;
        last.next = head;
        head = temp.next;
        temp.next = null;

        return head;
    }
}