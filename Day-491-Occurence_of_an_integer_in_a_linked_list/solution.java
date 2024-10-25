class Solution {
    public static int count(Node head, int key) {
        // code here
        int ans = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ans++;
            }
            temp = temp.next;
        }

        return ans;
    }
}