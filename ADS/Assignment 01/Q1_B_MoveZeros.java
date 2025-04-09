public class Q1_B_MoveZeros {
    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 20, 0, 8, 15};
        moveZerosToEnd(arr);
        System.out.print("Array after moving zeros: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }
        
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }
}