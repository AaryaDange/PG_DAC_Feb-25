public class Q3_A_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 6, 8};
        int key = 3;
        int index = binarySearch(arr, key);
        System.out.println("Key found at index: " + index);
    }
    
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}