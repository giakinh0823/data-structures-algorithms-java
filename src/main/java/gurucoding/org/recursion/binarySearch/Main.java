package gurucoding.org.recursion.binarySearch;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.rInsert(6);
        binarySearchTree.rInsert(7);
        binarySearchTree.rInsert(1);
        binarySearchTree.rInsert(1);
        binarySearchTree.rInsert(5);
        binarySearchTree.rInsert(9);

        System.out.println(binarySearchTree.rContains(5));
        System.out.println(binarySearchTree.rContains(20));
    }
}
