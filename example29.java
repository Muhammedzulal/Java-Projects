
public class example29 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}