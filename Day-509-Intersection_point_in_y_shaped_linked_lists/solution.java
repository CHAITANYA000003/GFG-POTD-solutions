class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        // code here
        int n = 0;
        int m = 0;
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null) {
            n++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            m++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;

        if (n > m) {
            while (n != m) {
                temp1 = temp1.next;
                n--;
            }
        } else {
            while (m != n) {
                temp2 = temp2.next;
                m--;
            }
        }

        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1.data;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return -1;
    }
}