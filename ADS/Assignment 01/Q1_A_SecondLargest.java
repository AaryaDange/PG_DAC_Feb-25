public class Q1_A_SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 20, 0, 8, 15};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element: " + secondLargest);
    }
    
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }
}