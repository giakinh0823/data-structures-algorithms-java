package gurucoding.org.doublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);

        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);
        doublyLinkedList.printList();

        System.out.println(doublyLinkedList.removeLast().value);
        doublyLinkedList.printList();

        doublyLinkedList.prepend(0);
        doublyLinkedList.printList();

        System.out.println(doublyLinkedList.removeFirst().value);;
        doublyLinkedList.printList();

        System.out.println(doublyLinkedList.get(2).value);

        System.out.println(doublyLinkedList.set(1, 9));
        doublyLinkedList.printList();

        System.out.println(doublyLinkedList.insert(2, 12));
        doublyLinkedList.printList();

        System.out.println(doublyLinkedList.remove(3));
        doublyLinkedList.printList();

        System.out.println("Head: " + doublyLinkedList.getHead());
        System.out.println("Tail: " + doublyLinkedList.getTail());
        System.out.println("Length: " + doublyLinkedList.getLength());
    }
}
