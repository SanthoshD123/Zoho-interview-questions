import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    static List<Integer> primeDivision(int N) {
        List<Integer> result = new ArrayList<>();

        // Helper function to check if a number is prime
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        sieveOfEratosthenes(N, isPrime);

        for (int i = 2; i <= N / 2; i++) {
            if (isPrime[i] && isPrime[N - i]) {
                result.add(i);
                result.add(N - i);
                break;
            }
        }

        return result;
    }

    // Sieve of Eratosthenes to find primes up to a given number
    private static void sieveOfEratosthenes(int N, boolean[] isPrime) {
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
