public class Q4_C_SumOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Sum of digits of " + num + ": " + sumDigits(num));
    }
    
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }
}