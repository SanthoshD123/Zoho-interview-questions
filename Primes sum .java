class Solution {
    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to check if N can be expressed as the sum of two prime numbers
    static String isSumOfTwo(int N) {
        // Iterate through numbers from 2 to N/2
        for (int i = 2; i <= N / 2; i++) {
            // Check if both i and N - i are prime
            if (isPrime(i) && isPrime(N - i)) {
                return "Yes";
            }
        }
        return "No";
    }
}
