public class Q3_C_PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 18, 4, 5, 0};
        System.out.println("Peak element: " + findPeakElement(arr));
    }
    
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) left = mid + 1;
            else right = mid;
        }
        return arr[left];
    }
}