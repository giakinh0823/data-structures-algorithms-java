package gurucoding.org.tree.binarySearch;

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

    public boolean insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return true;
        }

        Node temp = root;
        while (true) {
            if (node.value == temp.value) {
                return false;
            }

            if (node.value < temp.value) {
                if (temp.left == null) {
                    temp.left = node;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = node;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) {
            return false;
        }

        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }

        return false;
    }

    public Node getRoot() {
        return root;
    }
}
