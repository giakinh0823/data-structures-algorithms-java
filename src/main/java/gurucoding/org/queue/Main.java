package gurucoding.org.queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(1);
        queue.printQueue();

        queue.enqueue(2);
        queue.enqueue(3);

        queue.printQueue();

        System.out.println(queue.dequeue().value);
        queue.dequeue();
        queue.printQueue();

        System.out.println("First: " + queue.getFirst());
        System.out.println("Last: " + queue.getLast());
        System.out.println("Length: " + queue.getLength());
    }
}
