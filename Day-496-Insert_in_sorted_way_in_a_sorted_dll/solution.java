class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node node = new Node(x);
        Node temp = head;
        Node prev = null;
        if (temp == null) {
            return node;
        }

        while (temp != null && temp.data < x) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            // insert at the end of the dll
            node.prev = prev;
            prev.next = node;
        } else if (temp.prev == null) {
            // insert at the beginning of the dll
            node.next = temp;
            temp.prev = node;
            head = node;
        } else {
            // insert somewhere in the middle of the dll
            node.next = temp;
            node.prev = temp.prev;
            temp.prev.next = node;
            temp.prev = node;
        }

        return head;
    }
}