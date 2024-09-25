class Solution {
    Node reverseLL(Node head) {
        if (head.next == null) {
            // implies only one node is present in the list
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next = head;
        while (next != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find the middle element. slow will be pointing to m1 by the end of the
        // loop
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. reverse the list after the middle element
        Node temp1 = reverseLL(slow.next);

        // 3. iterate through the beginning and the middle parallely and compare
        Node temp2 = head;
        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                reverseLL(slow.next);
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        reverseLL(slow.next);
        return true;
    }
}