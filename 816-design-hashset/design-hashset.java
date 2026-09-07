class MyHashSet {
    // A prime number for the number of buckets to reduce hash collisions
    private static final int BASE = 769;
    private Node[] buckets;

    // Singly linked list node structure
    private static class Node {
        int key;
        Node next;

        Node(int key) {
            this.key = key;
        }
    }

    public MyHashSet() {
        buckets = new Node[BASE];
    }
    
    private int hash(int key) {
        return key % BASE;
    }

    public void add(int key) {
        int index = hash(key);
        Node current = buckets[index];
        
        // Traverse the bucket to see if the key already exists
        while (current != null) {
            if (current.key == key) {
                return; // Key already present; sets do not store duplicates
            }
            current = current.next;
        }
        
        // Insert the new node at the head of the linked list for O(1) insertion
        Node newNode = new Node(key);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    public void remove(int key) {
        int index = hash(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    // Node to remove is the head of the bucket list
                    buckets[index] = current.next;
                } else {
                    // Node to remove is in the middle or end
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public boolean contains(int key) {
        int index = hash(key);
        Node current = buckets[index];
        
        while (current != null) {
            if (current.key == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}



// class MyHashSet {
//     //int key;
//     private boolean[] set;
//     public MyHashSet() {
//         set = new boolean[1000001];
//     }
    
//     public void add(int key) {
//         set[key] = true;
//     }
    
//     public void remove(int key) {
//         set[key] = false;
//     }
    
//     public boolean contains(int key) {
//         return set[key];
//     }
// }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */