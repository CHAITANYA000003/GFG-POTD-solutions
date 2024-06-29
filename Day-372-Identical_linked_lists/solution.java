class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        boolean flag = true;
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                flag = false;
                break;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        if ((head1 == null && head2 != null) || (head2 == null && head1 != null)) {
            flag = false;
        }

        return flag;
    }
}