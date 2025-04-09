public class Q5_ComplexityAnalysis {
    public static void main(String[] args) {
        System.out.println("1. printTriangle(4):");
        printTriangle(4);
        System.out.println("\nTime complexity: O(n²)");
        
        System.out.println("\n2. printPattern(8):");
        printPattern(8);
        System.out.println("Time complexity: O(n log n)");
        
        System.out.println("\n3. recHalf(20):");
        recHalf(20);
        System.out.println("\nTime complexity: O(log n)");
        
        System.out.println("\n4. fun(3):");
        fun(3);
        System.out.println("Time complexity: O(2ⁿ)");
        
        System.out.println("\n5. tripleNested(3):");
        tripleNested(3);
        System.out.println("Time complexity: O(n³)");
    }
    
    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
    
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i *= 2) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + "," + j);
            }
        }
    }
    
    public static void recHalf(int n) {
        if (n <= 0) return;
        System.out.print(n + " ");
        recHalf(n / 2);
    }
    
    public static void fun(int n) {
        if (n == 0) return;
        fun(n - 1);
        fun(n - 1);
    }
    
    public static void tripleNested(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println(i + j + k);
                }
            }
        }
    }
}