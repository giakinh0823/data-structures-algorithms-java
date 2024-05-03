package gurucoding.org.linkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);

        linkedList.append(2);
        linkedList.append(3);
        linkedList.printList();

        System.out.println(linkedList.removeLast().value);
        linkedList.printList();

        linkedList.prepend(6);
        linkedList.printList();

        System.out.println(linkedList.get(2).value);

        System.out.println(linkedList.removeFirst().value);
        System.out.println(linkedList.set(1, 7));
        linkedList.printList();

        System.out.println(linkedList.insert(2, 9));
        linkedList.insert(1, 10);
        linkedList.insert(0, 6);
        linkedList.printList();

        System.out.println(linkedList.remove(3).value);
        linkedList.printList();

        linkedList.reverse();
        linkedList.printList();

        System.out.println("Head: " + linkedList.getHead());
        System.out.println("Tail: " + linkedList.getTail());
        System.out.println("Length: " + linkedList.getLength());
    }
}
