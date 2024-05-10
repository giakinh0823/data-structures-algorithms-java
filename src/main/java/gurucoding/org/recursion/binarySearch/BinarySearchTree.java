package gurucoding.org.recursion.binarySearch;

public class BinarySearchTree {

    private Node root;

    public static class Node {

        int value;
        Node right;
        Node left;

        public Node(int value) {
            this.value = value;
        }
    }

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(int value) {
        root = new Node(value);
    }

    public Node rInsert(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value);
        }

        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        rInsert(root, value);
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    public boolean rContains(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }

        if (currentNode.value == value) {
            return true;
        }

        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        }

        return rContains(currentNode.right, value);
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public Node rDeleteNode(Node currentNode, int value) {
        if (currentNode == null) {
            return null;
        }

        if (value < currentNode.value) {
            currentNode.left = rDeleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rDeleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = rDeleteNode(currentNode.right, subTreeMin);
            }
        }

        return currentNode;
    }

    public void rDeleteNode(int value) {
        rDeleteNode(root, value);
    }

    public Node getRoot() {
        return root;
    }
}
