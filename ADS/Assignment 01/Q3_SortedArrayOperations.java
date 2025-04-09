public class Q3_SortedArrayOperations {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 6, 8};
        int key = 3;
        
        // refered to Binary search :----------------------------------
        int index = binarySearch(arr, key);
        System.out.println("Key found at index: " + index);
        
        // First and last occurrence :------------------------------------------
        int first = findFirstOccurrence(arr, key);
        int last = findLastOccurrence(arr, key);
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
        
        // Count of key :---------------------------------------------
        System.out.println("Total count of key: " + (last - first + 1));
        
        // Peak element :---------------------------------------------------------
        int[] peakArr = {1, 2, 18, 4, 5, 0};
        System.out.println("Peak element: " + findPeakElement(peakArr));
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