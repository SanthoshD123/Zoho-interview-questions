class Solution {
    void modifyAndRearrangeArr(int arr[], int n) {
        int i = 0;

        while (i < n - 1) {
            // Check if the current element is a valid number and equal to the next one
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                // Double the current number and replace the next number with 0
                arr[i] *= 2;
                arr[i + 1] = 0;
                i++;  // Skip the next element as it's now 0
            }

            i++;
        }

        // Rearrange the array by moving all non-zero elements to the front
        int nonZeroCount = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZeroCount];
                arr[nonZeroCount] = arr[i];
                arr[i] = temp;
                nonZeroCount++;
            }
        }
    }
}
