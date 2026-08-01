package advanced.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {
    // QUESTION: Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph.
    // Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
    // Time Complexity: O(V + E) where V is vertices and E is edges
    // Space Complexity: O(V)

    static class Node {
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

    public static Node cloneGraph(Node node) {
        if (node == null) return null;

        Map<Node, Node> visited = new HashMap<>();
        return cloneGraphHelper(node, visited);
    }

    private static Node cloneGraphHelper(Node node, Map<Node, Node> visited) {
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node clone = new Node(node.val);
        visited.put(node, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraphHelper(neighbor, visited));
        }

        return clone;
    }

    public static void main(String[] args) {
        // Create graph: [[2,4],[1,3],[2,4],[1,3]]
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Node cloned = cloneGraph(node1);
        System.out.println("Cloned graph root value: " + cloned.val); // Output: 1
        System.out.println("Cloned graph neighbors count: " + cloned.neighbors.size()); // Output: 2
    }
}
