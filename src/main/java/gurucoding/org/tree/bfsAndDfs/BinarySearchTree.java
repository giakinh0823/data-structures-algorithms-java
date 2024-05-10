package gurucoding.org.tree.bfsAndDfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public List<Integer> bfs() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        List<Integer> results = new ArrayList<>();
        queue.add(currentNode);
        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    public List<Integer> dfsPreOrder() {
        List<Integer> results = new ArrayList<>();

        class Traverse {

            Traverse(Node currentNode) {
                results.add(currentNode.value);
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }

        new Traverse(root);
        return results;
    }

    public List<Integer> dfsPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {

            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }

        new Traverse(root);

        return results;
    }

    public List<Integer> dfsInorder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {

            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }

        new Traverse(root);

        return results;
    }

    public Node getRoot() {
        return root;
    }
}
