class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node temp1 = head1;
        Node temp2 = head2;
        Node head = new Node(-1); // temporary head
        Node temp = head;
        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        while (temp1 != null) {
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;
        }
        while (temp2 != null) {
            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }

        return head.next;
    }
}