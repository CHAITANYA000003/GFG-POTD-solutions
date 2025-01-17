class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        Node next = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}