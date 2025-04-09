public class Q5_E_TripleNested {
    public static void main(String[] args) {
        tripleNested(3);
        System.out.println("Time complexity: O(n³)");
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