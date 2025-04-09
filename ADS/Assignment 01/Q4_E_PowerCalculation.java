public class Q4_E_PowerCalculation {
    public static void main(String[] args) {
        int a = 2, b = 5;
        System.out.println(a + "^" + b + " = " + power(a, b));
    }
    
    public static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }
}