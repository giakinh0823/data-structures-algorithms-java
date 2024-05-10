package gurucoding.org.tree.bfsAndDfs;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(47);
        binarySearchTree.insert(21);
        binarySearchTree.insert(76);
        binarySearchTree.insert(18);
        binarySearchTree.insert(27);
        binarySearchTree.insert(52);
        binarySearchTree.insert(82);

        System.out.println(binarySearchTree.bfs());
        System.out.println(binarySearchTree.dfsPreOrder());
        System.out.println(binarySearchTree.dfsPostOrder());
        System.out.println(binarySearchTree.dfsInorder());
    }
}
