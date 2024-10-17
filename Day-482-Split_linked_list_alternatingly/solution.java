class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
        // TC: O(N), SC:O(1)
        if (head == null) {
            return new Node[] { null, null };
        }
        Node head1 = head;
        Node head2 = head.next;
        Node temp1 = null;
        Node temp2 = null;
        Node temp = head;
        int count = 1;
        while (temp != null) {
            if ((count & 1) == 1) {
                if (temp1 == null) {
                    temp1 = temp;
                } else {
                    temp1.next = temp;
                    temp1 = temp1.next;
                }
            } else {
                if (temp2 == null) {
                    temp2 = temp;
                } else {
                    temp2.next = temp;
                    temp2 = temp2.next;
                }
            }

            temp = temp.next;
            count++;
        }
        if (temp1 != null) {
            temp1.next = null;
        }
        if (temp2 != null) {
            temp2.next = null;
        }

        return new Node[] { head1, head2 };

    }
}