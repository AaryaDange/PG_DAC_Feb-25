public class Q4_A_PrimeCheck {
    public static void main(String[] args) {
        int num = 7;
        System.out.println("Is prime: " + isPrime(num, 2));
    }
    
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }
}