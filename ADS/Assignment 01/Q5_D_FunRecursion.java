public class Q5_D_FunRecursion {
    public static void main(String[] args) {
        fun(3);
        System.out.println("Time complexity: O(2ⁿ)");
    }
    
    public static void fun(int n) {
        if (n == 0) return;
        fun(n - 1);
        fun(n - 1);
    }
}