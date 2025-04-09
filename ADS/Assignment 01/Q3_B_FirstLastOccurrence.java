public class Q3_B_FirstLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 6, 8};
        int key = 3;
        
        int first = findFirstOccurrence(arr, key);
        int last = findLastOccurrence(arr, key);
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
        System.out.println("Total count of key: " + (last - first + 1));
    }
    
    public static int findFirstOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return result;
    }
    
    public static int findLastOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return result;
    }
}