public class Q4_RecursiveOperations {
    public static void main(String[] args) {
        int num = 7;
        String str = "racecar";
        int sumNum = 1234;
        int fibIndex = 6;
        int a = 2, b = 5;
        
        System.out.println("Is prime: " + isPrime(num, 2));
        System.out.println("Is '" + str + "' a palindrome? " + isPalindrome(str, 0, str.length() - 1));
        System.out.println("Sum of digits of " + sumNum + ": " + sumDigits(sumNum));
        System.out.println("Fibonacci(" + fibIndex + "): " + fibonacci(fibIndex));
        System.out.println(a + "^" + b + " = " + power(a, b));
    }
    
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }
    
    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }
    
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }
}