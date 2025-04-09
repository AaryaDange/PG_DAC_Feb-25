public class Q5_C_RecHalf {
    public static void main(String[] args) {
        recHalf(20);
        System.out.println("\nTime complexity: O(log n)");
    }
    
    public static void recHalf(int n) {
        if (n <= 0) return;
        System.out.print(n + " ");
        recHalf(n / 2);
    }
}