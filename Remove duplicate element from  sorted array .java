class Solution {
    int remove_duplicate(int A[], int N) {
        if (N == 0) {
            return 0; // Empty array, no distinct elements.
        }
        
        int distinctCount = 1; // At least one distinct element (the first one).
        
        for (int i = 1; i < N; i++) {
            if (A[i] != A[i - 1]) {
                A[distinctCount] = A[i];
                distinctCount++;
            }
        }
        
        return distinctCount;
    }
}
