class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        Node temp = head;
        while (temp != null) {
            Node copy = new Node(temp.data);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }

        temp = head;
        while (temp != null && temp.next != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        temp = head;
        Node ans = temp.next;
        Node temp2 = null;
        while (temp != null && temp.next != null) {
            temp2 = temp.next;
            temp.next = temp2.next;
            temp = temp2;
        }

        return ans;
    }
}