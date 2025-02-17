class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        Map<Node, Node> clones = new HashMap<>();
        return dfs(node, clones);
        }

        private Node dfs(Node node, Map<Node, Node> clones) {
            if (clones.containsKey(node)) return clones.get(node);

            Node copy = new Node(node.val);
            clones.put(node, copy);

            for (Node neighbor : node.neighbors) {
                copy.neighbors.add(dfs(neighbor, clones));
            }

            return copy;
    }
}
