class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return (count & 1) == 0;
    }
}