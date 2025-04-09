public class Q5_A_PrintTriangle {
    public static void main(String[] args) {
        printTriangle(4);
        System.out.println("\nTime complexity: O(n²)");
    }
    
    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}