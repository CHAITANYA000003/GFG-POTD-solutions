class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow = head;
        Node fast = head;
        boolean isLoop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isLoop = true;
                break;
            }
        }
        if (!isLoop) {
            return 0;
        }

        // After the below loop, slow will point to the intersection node
        // slow = head;
        // while(slow != fast) {
        // slow = slow.next;
        // fast = fast.next;
        // }

        int ans = 1;
        fast = fast.next;
        while (slow != fast) {
            fast = fast.next;
            ans++;
        }

        return ans;
    }
}