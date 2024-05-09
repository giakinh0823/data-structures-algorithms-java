package gurucoding.org.heap;

public class Main {

    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);

        System.out.println(heap.getHeap());

        heap.insert(100);
        System.out.println(heap.getHeap());

        heap.insert(72);
        System.out.println(heap.getHeap());

        Heap heap1 = new Heap();
        heap1.insert(95);
        heap1.insert(75);
        heap1.insert(80);
        heap1.insert(55);
        heap1.insert(60);
        heap1.insert(50);
        heap1.insert(65);
        System.out.println(heap1.getHeap());

        heap1.remove();
        System.out.println(heap1.getHeap());

        heap1.remove();
        System.out.println(heap1.getHeap());

        heap1.remove();
        System.out.println(heap1.getHeap());
    }
}