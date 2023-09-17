class Solution {
    int count(int[] arr, int n, int x) {
        int firstOccurrence = findFirstOccurrence(arr, n, x);
        if (firstOccurrence == -1) {
            return 0; // Element X is not present in the array
        }
        
        int lastOccurrence = findLastOccurrence(arr, n, x);
        
        return lastOccurrence - firstOccurrence + 1;
    }

    private int findFirstOccurrence(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int firstOccurrence = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                firstOccurrence = mid;
                high = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return firstOccurrence;
    }

    private int findLastOccurrence(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int lastOccurrence = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                lastOccurrence = mid;
                low = mid + 1; // Continue searching in the right half
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return lastOccurrence;
    }
}
