class Solution {
    private static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = head.next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    static Node addTwoLists(Node num1, Node num2) {
        // code here
        Node head1 = reverse(num1);
        Node head2 = reverse(num2);
        Node temp1 = head1;
        Node temp2 = head2;
        Node head = null;
        Node temp = null;
        int carry = 0;
        while (temp1 != null && temp2 != null) {
            int val = temp1.data + temp2.data + carry;
            carry = val / 10;
            val = val % 10;
            Node next = new Node(val);
            if (head == null) {
                head = next;
                temp = head;
            }
            temp.next = next;
            temp = temp.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while (temp1 != null) {
            int val = temp1.data + carry;
            carry = val / 10;
            val = val % 10;
            Node next = new Node(val);
            temp.next = next;
            temp = temp.next;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            int val = temp2.data + carry;
            carry = val / 10;
            val = val % 10;
            Node next = new Node(val);
            temp.next = next;
            temp = temp.next;
            temp2 = temp2.next;
        }
        if (carry == 1) {
            Node next = new Node(1);
            temp.next = next;
        }
        reverse(head1);
        reverse(head2);
        Node ans = reverse(head);
        while (ans != null && ans.data == 0) {
            ans = ans.next;
        }
        if (ans == null) {
            return new Node(0);
        }
        return ans;
    }
}