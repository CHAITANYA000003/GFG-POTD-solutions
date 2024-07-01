class Solution {
    public Tree convert(Node head, Tree node) {
        Queue<Tree> q = new LinkedList<>();
        node = new Tree(head.data);
        q.add(node);
        while (head.next != null) {
            Tree temp = q.poll();
            if (head.next != null) {
                head = head.next;
                temp.left = new Tree(head.data);
                q.add(temp.left);
            }
            if (head.next != null) {
                head = head.next;
                temp.right = new Tree(head.data);
                q.add(temp.right);
            }
        }

        return node;
    }
}