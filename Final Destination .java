public class Solution {
    static int canReach(long a, long b, long x) {
        long distance = Math.abs(a) + Math.abs(b);

        // Check if the distance is reachable in exactly x steps
        if (distance > x || (x - distance) % 2 != 0) {
            return 0; // Not reachable
        } else {
            return 1; // Reachable
        }
    }

    public static void main(String[] args) {
        long a = 5, b = 5, x = 11;
        int result = canReach(a, b, x);

        System.out.println(result);
    }
}
