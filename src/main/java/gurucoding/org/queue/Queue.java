package gurucoding.org.queue;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public static class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node node = new Node(value);
        first = last = node;
        length = 1;
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (length == 0) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        length++;
    }

    public Node dequeue() {
        if (length == 0) {
            return null;
        }
        Node temp = first;
        if (length == 1) {
            first = last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getFirst() {
        return first.value;
    }

    public int getLast() {
        return last.value;
    }

    public int getLength() {
        return length;
    }
}
