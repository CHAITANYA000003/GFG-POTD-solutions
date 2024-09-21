class Solution {
    // Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
        if (head == null) {
            return null;
        }

        // interleaving the original list with the cloned nodes
        Node temp = head;
        while (temp != null) {
            Node newNode = new Node(temp.data);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }

        // setting up random pointers for the cloned nodes
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        // separating the original and the cloned lists
        Node newHead = head.next;
        temp = head;
        Node cloneTemp = newHead;
        while (cloneTemp.next != null) {
            temp.next = temp.next.next; // restoring the orginal list's next pointer
            temp = temp.next; // moving forward in the original list

            cloneTemp.next = cloneTemp.next.next; // fixing the clone list's next pointer
            cloneTemp = cloneTemp.next; // moving forward in the clone list
        }
        temp.next = null;

        return newHead;
    }
}