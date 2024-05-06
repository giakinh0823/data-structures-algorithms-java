package gurucoding.org.stack;

public class Stack {

    private Node top;
    private Integer height;

    public static class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        this.top = new Node(value);
        height = 1;
    }

    public void push(int value) {
        Node node = new Node(value);
        if (height != 0) {
            node.next = top;
        }
        top = node;
        height++;
    }

    public Node pop() {
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getTop() {
        return top.value;
    }

    public int getHeight() {
        return height;
    }
}
