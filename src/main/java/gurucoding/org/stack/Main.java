package gurucoding.org.stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();

        System.out.println(stack.pop().value);
        stack.pop();
        stack.printStack();

        System.out.println("Top: " + stack.getTop());
        System.out.println("Height: " + stack.getHeight());
    }
}
