class Solution {
    
    // Function to rearrange the array elements alternately.
    public static void rearrange(long arr[], int n) {
        int max_idx = n - 1; // Initialize max index
        int min_idx = 0;    // Initialize min index
        long max_element = arr[n - 1] + 1; // Store any element that is greater than the maximum element
        
        for (int i = 0; i < n; i++) {
            // At even index, store the maximum element
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max_element) * max_element;
                max_idx--;
            }
            // At odd index, store the minimum element
            else {
                arr[i] += (arr[min_idx] % max_element) * max_element;
                min_idx++;
            }
        }

        // Update the array with rearranged values
        for (int i = 0; i < n; i++) {
            arr[i] /= max_element;
        }
    }

    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        rearrange(arr, n);

        // Print the modified array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
