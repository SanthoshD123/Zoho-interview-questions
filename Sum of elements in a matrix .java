class Solution {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        // Initialize sum to 0
        int totalSum = 0;

        // Iterate through the matrix and add each element to the sum
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                totalSum += Grid[i][j];
            }
        }

        return totalSum;
    }
}
