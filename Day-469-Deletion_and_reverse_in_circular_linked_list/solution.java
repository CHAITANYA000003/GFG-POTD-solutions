class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        // code here
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = null;

        temp = head;
        Node prev = null;
        Node curr = head;
        Node next = curr;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        temp.next = prev;

        return prev;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        // code here
        if (head.next == head) {
            if (head.data == key) {
                return null;
            }
            return head;
        }

        Node temp = head;
        if (head.data == key) {
            while (temp.next != head) {
                temp = temp.next;
            }
            head = temp.next.next;
            temp.next = temp.next.next;
        } else {
            while (temp.next.data != key) {
                temp = temp.next;
                if (temp == head) {
                    return head;
                }
            }
            temp.next = temp.next.next;
        }

        return head;
    }
}