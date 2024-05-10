package gurucoding.org.dynamic;

public class Fibonacci {

    public static int fib(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int f0 = 1;
        int f1 = 1;
        for (int i = 3; i <= n; i++) {
            int f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        return f1;
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
