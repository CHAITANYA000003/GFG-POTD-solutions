class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        Node temp = head;
        Node toRemove = head;
        int sum = 0;

        while (temp != null) {
            if (n <= 0) {
                sum -= toRemove.data;
                toRemove = toRemove.next;
            }

            sum += temp.data;
            temp = temp.next;
            n--;
        }

        return sum;
    }
}