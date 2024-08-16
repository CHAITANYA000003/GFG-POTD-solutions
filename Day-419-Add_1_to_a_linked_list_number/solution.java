
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {

    public Node reverseLL(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public Node addOne(Node head) {
        // code here.
        head = reverseLL(head);
        // while(head!=null) {
        // System.out.print(head.data + " ");
        // head = head.next;
        // }
        Node temp = head;
        Node last = null;
        int carry = 1;
        while (temp != null) {
            temp.data = temp.data + carry;
            carry = temp.data / 10;
            temp.data = temp.data % 10;
            last = temp;
            temp = temp.next;
            if (carry < 1) {
                break;
            }
        }
        if (carry == 1) {
            Node node = new Node(1);
            last.next = node;
        }

        head = reverseLL(head);

        return head;
    }
}