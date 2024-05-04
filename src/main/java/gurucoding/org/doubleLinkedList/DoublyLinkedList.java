package gurucoding.org.doubleLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public static class Node {

        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node node = new Node(value);
        head = tail = node;
        length = 1;
    }

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;
        if (length == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }


    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }


    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        Node node = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;

        node.prev = before;
        node.next = after;
        before.next = node;
        after.prev = node;

        length++;
        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();

        Node temp = get(index);

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;

        length--;
        return temp;
    }

    public int getHead() {
        return head.value;
    }

    public int getTail() {
        return tail.value;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
