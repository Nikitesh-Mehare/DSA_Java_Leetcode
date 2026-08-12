/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
import java.util.*;

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        
        // Map to store {OriginalNode: ClonedNode}
        Map<Node, Node> clonedMap = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        
        // Initialize with the starting node
        clonedMap.put(node, new Node(node.val, new ArrayList<>()));
        queue.add(node);
        
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            
            // Iterate through all neighbors of the original node
            for (Node neighbor : curr.neighbors) {
                // If neighbor has not been cloned yet
                if (!clonedMap.containsKey(neighbor)) {
                    clonedMap.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                    queue.add(neighbor); // Push original neighbor to queue for processing
                }
                // Add the cloned neighbor to the current cloned node's neighbor list
                clonedMap.get(curr).neighbors.add(clonedMap.get(neighbor));
            }
        }
        
        return clonedMap.get(node);
    }
}
