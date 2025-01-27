class Node {
    int key;
    int value;
    Node next;
    Node prev;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

// design the class in the most optimal way
class LRUCache {
    HashMap<Integer, Node> hm = new HashMap<>();
    Node head, tail;
    int capacity;

    // Constructor for initializing the cache capacity with the given value.
    LRUCache(int cap) {
        // code here
        this.capacity = cap;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    // function to delete node
    void deleteNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    // function to insert node at the beginning
    void insertNode(Node node) {
        Node nextNode = head.next;
        head.next = node;
        nextNode.prev = node;
        node.next = nextNode;
        node.prev = head;
    }

    // Function to return value corresponding to the key.
    public int get(int key) {
        // your code here
        if (!hm.containsKey(key)) {
            return -1;
        }
        Node node = hm.get(key);
        deleteNode(node);
        insertNode(node);
        return node.value;
    }

    // Function for storing key-value pair.
    public void put(int key, int value) {
        // your code here
        if (hm.containsKey(key)) {
            Node node = hm.get(key);
            node.value = value;
            deleteNode(node);
            insertNode(node);
        } else {
            if (hm.size() == capacity) {
                hm.remove(tail.prev.key);
                deleteNode(tail.prev);
            }
            Node node = new Node(key, value);
            hm.put(key, node);
            insertNode(node);
        }
    }
}