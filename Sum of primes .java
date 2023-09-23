class Solution {
    static int primeSum(int N) {
        int sum = 0;
        String strN = Integer.toString(N);

        for (int i = 0; i < strN.length(); i++) {
            char digit = strN.charAt(i);
            int num = digit - '0';

            if (isPrime(num)) {
                sum += num;
            }
        }

        return sum;
    }

    // Helper function to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
