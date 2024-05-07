package gurucoding.org.tree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        System.out.println(binarySearchTree.insert(6));
        System.out.println(binarySearchTree.insert(7));
        System.out.println(binarySearchTree.insert(1));
        System.out.println(binarySearchTree.insert(1));
        System.out.println(binarySearchTree.insert(5));
        System.out.println(binarySearchTree.insert(9));

        System.out.println(binarySearchTree.contains(5));
    }
}
