public class Q4_D_Fibonacci {
    public static void main(String[] args) {
        int fibIndex = 6;
        System.out.println("Fibonacci(" + fibIndex + "): " + fibonacci(fibIndex));
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}