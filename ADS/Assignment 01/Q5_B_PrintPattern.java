public class Q5_B_PrintPattern {
    public static void main(String[] args) {
        printPattern(8);
        System.out.println("Time complexity: O(n log n)");
    }
    
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i *= 2) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + "," + j);
            }
        }
    }
}